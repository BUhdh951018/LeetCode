package No337;

import structure.TreeNode;

public class DP_337 {
    public int rob(TreeNode root) {
        int[] result = dp(root);
        return Math.max(result[0], result[1]);
    }

    private int[] dp(TreeNode root) {
        int[] result = new int[2];

        if (root == null)
            return result;

        int[] left = dp(root.left);
        int[] right = dp(root.right);

        // 0 = not select root, 1 = select root
        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        result[1] = left[0] + right[0] + root.val;

        return result;

    }
}
