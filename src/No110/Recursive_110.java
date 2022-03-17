package No110;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 5:49 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_110 {
    private boolean result = true;

    public boolean isBalanced(TreeNode root) {
        depth(root);
        return result;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left - right) > 1)
            result = false;
        return 1 + Math.max(left, right);
    }
}

