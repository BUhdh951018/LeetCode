package No671;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/16 9:48 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Basic_671 {
    private List<Integer> list = new ArrayList<>();
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        Collections.sort(list);
        int res = Integer.MIN_VALUE;
        int flag = 2;
        for (int temp : list) {
            if (temp != res && temp > res) {
                res = temp;
                flag--;
            }
            if (flag == 0)
                break;

        }
        if (flag != 0) {
            return -1;
        }
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}
