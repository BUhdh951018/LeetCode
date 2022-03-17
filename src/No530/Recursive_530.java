package No530;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/17 7:08 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_530 {
    private int ans = Integer.MAX_VALUE;
    private TreeNode node;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        if (node != null)
            ans = Math.min(ans, Math.abs(root.val - node.val));
        node = root;
        dfs(root.right);
    }
}

