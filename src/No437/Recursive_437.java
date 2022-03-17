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
        ans = pathFromRoot(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
        return ans;
    }

    private int pathFromRoot(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        int ans = 0;
        if (root.val == targetSum)
            ans++;
        ans += pathFromRoot(root.left, targetSum - root.val)
                + pathFromRoot(root.right, targetSum - root.val);
        return ans;
    }
}
