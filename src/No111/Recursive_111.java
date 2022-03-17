package No111;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 8:56 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null || root.right == null) {
            return minDepth(root.left) + minDepth(root.right) + 1;
        }
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
