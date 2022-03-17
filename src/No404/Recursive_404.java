package No404;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 9:06 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (isLeaf(root.left))
            return root.left.val + sumOfLeftLeaves(root.right);
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    private boolean isLeaf(TreeNode node) {
        if (node == null)
            return false;
        return node.left == null && node.right == null;
    }
}
