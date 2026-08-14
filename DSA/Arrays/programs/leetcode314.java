package Arrays.programs;

import java.util.*;

public class leetcode314{

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<List<Integer>> verticalOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // column -> list of node values
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Two queues:
        // one for nodes, one for their column numbers
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> colQueue = new LinkedList<>();

        nodeQueue.offer(root);
        colQueue.offer(0);

        int minCol = 0;
        int maxCol = 0;

        while (!nodeQueue.isEmpty()) {

            TreeNode node = nodeQueue.poll();
            int col = colQueue.poll();

            // Add node to its column
            map.computeIfAbsent(col, k -> new ArrayList<>())
                    .add(node.val);

            minCol = Math.min(minCol, col);
            maxCol = Math.max(maxCol, col);

            // Left child -> column - 1
            if (node.left != null) {
                nodeQueue.offer(node.left);
                colQueue.offer(col - 1);
            }

            // Right child -> column + 1
            if (node.right != null) {
                nodeQueue.offer(node.right);
                colQueue.offer(col + 1);
            }
        }

        // Read columns from left to right
        for (int col = minCol; col <= maxCol; col++) {
            result.add(map.get(col));
        }

        return result;
    }

    public static void main(String[] args) {

        /*
                 3
                / \
               9   20
                  /  \
                 15   7
        */

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Call the solution
        List<List<Integer>> answer = verticalOrder(root);

        // Print answer
        System.out.println(answer);
    }
}