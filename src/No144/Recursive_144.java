package No144;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/17 4:02 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_144 {
    private List<Integer> ans = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null)
            return;
        ans.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
