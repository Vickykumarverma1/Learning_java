package Recursion;
import java.util.Arrays;
public class fibonacciwithmemoization {

//    earlier for calculating fibonacci number for big value takes a lot of time because it computes a same
//    function various times means it was linear recurrence but using memoization technique we can compute large
//    number in very efficiently and fastly.
//
    public static void main(String[] args) {
        int n = 100;

        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);

        System.out.println(fibo(n, dp));
    }

    static long fibo(int n, long[] dp) {
        if (n < 2) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }


        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);

        return dp[n];
    }
}