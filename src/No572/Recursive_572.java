package No572;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 8:33 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;
        return isSubtreeFromRoot(root, subRoot)
                || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    private boolean isSubtreeFromRoot(TreeNode root, TreeNode sub) {
        if (root == null && sub == null)
            return true;
        if (root == null || sub == null)
            return false;

        if (root.val != sub.val)
            return false;

        return isSubtreeFromRoot(root.left, sub.left)
                && isSubtreeFromRoot(root.right, sub.right);
    }
}
