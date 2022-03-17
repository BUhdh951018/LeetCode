package No687;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 9:15 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_687 {
    private int path = 0;

    public int longestUnivaluePath(TreeNode root) {
        find(root);
        return path;
    }

    private int find(TreeNode root) {
        if (root == null)
            return 0;

        int left = find(root.left);
        int right = find(root.right);

        int leftPath = root.left != null && root.left.val == root.val ? left + 1 : 0;
        int rightPath = root.right != null && root.right.val == root.val ? right + 1 : 0;
        path = Math.max(path, leftPath + rightPath);
        return Math.max(leftPath, rightPath);
    }
}
