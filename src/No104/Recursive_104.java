package No104;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 5:34 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
