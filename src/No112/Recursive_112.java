package No112;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 6:51 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null && root.val == targetSum)
            return true;
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }

}
