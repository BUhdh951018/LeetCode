package No230;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/17 5:05 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class InOrder_230 {
    private List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        dfs(root);
        return list.get(k - 1);
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
