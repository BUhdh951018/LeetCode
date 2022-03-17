package No101;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 8:45 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return false;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val)
            return false;

        return isSymmetric(left.left, right.right)
                && isSymmetric(left.right, right.left);
    }
}
