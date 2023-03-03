package No437;

import structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2023/2/28 2:32 下午
 * Description:
 */
public class Hash_437 {
    // todo
    private final Map<Long, Integer> map = new HashMap<>();
    private int t;
    public int pathSum(TreeNode root, int targetSum) {

        map.put(0L, 1);
        t = targetSum;
        return dfs(0L, root);
    }

    private int dfs(long cur, TreeNode root) {
        if (root == null)
            return 0;

        int temp = 0;
        cur += root.val;
        temp = map.getOrDefault(cur - t, 0);
        map.put(cur, map.getOrDefault(cur, 0) + 1);
        temp += dfs(cur, root.left);
        temp += dfs(cur, root.right);
        map.put(cur, map.getOrDefault(cur, 0) - 1);
        return temp;
    }
}
