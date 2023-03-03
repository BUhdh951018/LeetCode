package No437;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 8:22 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_437 {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int ans = 0;
        ans = pathFromRoot(root, (long)targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
        return ans;
    }

    private int pathFromRoot(TreeNode root, long targetSum) {
        if (root == null)
            return 0;
        int ans = 0;
        long value = root.val;
        if (value == targetSum)
            ans++;
        ans += pathFromRoot(root.left, targetSum - value)
                + pathFromRoot(root.right, targetSum - value);
        return ans;
    }
}
