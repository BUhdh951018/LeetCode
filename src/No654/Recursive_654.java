package No654;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/3/16 5:40 下午
 * Description:
 */
public class Recursive_654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length - 1);
    }

    private TreeNode construct(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int index = 0, max = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        TreeNode root = new TreeNode(max);

        root.left = construct(nums, left, index - 1);
        root.right = construct(nums, index + 1, right);

        return root;
    }
}
