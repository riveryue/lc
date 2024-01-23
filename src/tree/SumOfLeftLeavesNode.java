package tree;

import java.util.LinkedList;

public class SumOfLeftLeavesNode {

    private static int sumOfLeavesBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    sum += node.left.val;
                } else {
                    queue.offer(node.left);
                }
            }
            if (node.right != null && (node.right.left != null || node.right.right != null)) {
                queue.offer(node.right);
            }
        }
        return sum;
    }

    private static int sumOfLeavesDFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left, right;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            left = root.left.val;
        } else {
            left = sumOfLeavesDFS(root.left);
        }
        right = sumOfLeavesDFS(root.right);
        return left + right;
    }

    /**
     * 前序遍历求解左子树之和
     */
    int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root, false);
        return sum;
    }

    void dfs(TreeNode node, boolean isLeft) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null && isLeft) {
            sum += node.val;
        }
        dfs(node.left, true);
        dfs(node.right, false);
    }
}
