package No653;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/17 6:40 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_653 {
    private List<Integer> list = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        dfs(root);

        int i = 0, j = list.size() - 1;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum == k)
                return true;
            if (sum < k)
                i++;
            else j--;
        }
        return false;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
