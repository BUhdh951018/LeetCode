package No501;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/3/17 7:15 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_501 {
    private int curCnt = 1;
    private int maxCnt = 1;
    private TreeNode preNode = null;

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        dfs(root.left, list);
        if (preNode != null) {
            if (preNode.val == root.val)
                curCnt++;
            else
                curCnt = 1;
        }
        if (curCnt > maxCnt) {
            maxCnt = curCnt;
            list.clear();
            list.add(root.val);
        } else if (curCnt == maxCnt) {
            list.add(root.val);
        }
        preNode = root;
        dfs(root.right, list);
    }
}
