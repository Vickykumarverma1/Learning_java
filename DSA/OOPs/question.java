package OOPs;
import java.util.*;



/**
 * Momentum Locking with One Allowed Reset
 * ----------------------------------------
 * Rules:
 *   - Traverse array left to right, momentum starts at 0.
 *   - At index i: if a[i] > momentum, you MAY lock it (momentum = a[i]).
 *                 otherwise you MUST discard it.
 *   - You may reset momentum to 0 exactly once, at any point.
 *   - Goal: maximize number of locked elements.
 *
 * Key insight:
 *   "Lock only if greater than current momentum, momentum updates on lock"
 *   == choosing a strictly increasing subsequence (LIS).
 *   A single reset at index r splits the problem into two independent LIS
 *   problems: LIS(a[0..r-1]) and LIS(a[r..n-1]). Answer = best split.
 *
 * Complexity: O(n log n) time, O(n) space.
 */
public class question {

    public static int maxLockedWithReset(int[] a) {
        int n = a.length;
        if (n == 0) return 0;

        // ---- 1. Prefix LIS lengths: preLIS[r] = LIS length of a[0..r-1] ----
        int[] preLIS = new int[n + 1];
        int[] tails = new int[n];
        int tailsLen = 0;
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int pos = lowerBound(tails, tailsLen, x); // strict LIS -> lower_bound
            tails[pos] = x;
            if (pos == tailsLen) tailsLen++;
            preLIS[i + 1] = tailsLen;
        }

        // ---- 2. Suffix LIS lengths: sufLIS[i] = LIS length of a[i..n-1] ----
        // L(i) = 1 + max(L(j) for j > i with a[j] > a[i])
        // Computed right-to-left with a Fenwick tree (max) over compressed,
        // DESCENDING-ranked values, so "value greater than a[i]" becomes a
        // prefix-max query.
        int[] sortedVals = Arrays.stream(a).distinct().sorted().toArray();
        int m = sortedVals.length;
        Map<Integer, Integer> rankDesc = new HashMap<>();
        for (int idx = 0; idx < m; idx++) {
            rankDesc.put(sortedVals[idx], m - idx); // largest value -> rank 1
        }

        int[] fen = new int[m + 1];

        int[] sufLIS = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            int r = rankDesc.get(a[i]);
            int L = 1 + fenQuery(fen, r - 1);
            fenUpdate(fen, m, r, L);
            sufLIS[i] = Math.max(sufLIS[i + 1], L);
        }

        // ---- 3. Best split point ----
        int best = 0;
        for (int r = 0; r <= n; r++) {
            best = Math.max(best, preLIS[r] + sufLIS[r]);
        }
        return best;
    }

    // leftmost index in tails[0..len) with value >= x (strict LIS)
    private static int lowerBound(int[] tails, int len, int x) {
        int lo = 0, hi = len;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (tails[mid] < x) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    private static void fenUpdate(int[] fen, int m, int pos, int val) {
        while (pos <= m) {
            if (fen[pos] < val) fen[pos] = val;
            pos += pos & (-pos);
        }
    }

    private static int fenQuery(int[] fen, int pos) { // max over ranks [1, pos]
        int res = 0;
        while (pos > 0) {
            if (fen[pos] > res) res = fen[pos];
            pos -= pos & (-pos);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 5, 2, 6, 4, 8};
        System.out.println("array: " + Arrays.toString(a));
        System.out.println("best with one reset: " + maxLockedWithReset(a));

        int[][] tests = {
                {},
                {5},
                {1, 2, 3, 4, 5},
                {7,7,7,7,7},
                {4, 4, 4, 4},
                {10, 1, 2, 3, 9, 4, 5, 6, 7}
        };
        for (int[] t : tests) {
            System.out.println(Arrays.toString(t) + " -> " + maxLockedWithReset(t));
        }
    }
}