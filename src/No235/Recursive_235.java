package No235;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/17 5:39 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
