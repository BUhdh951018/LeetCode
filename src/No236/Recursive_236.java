package No236;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/17 5:45 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}
