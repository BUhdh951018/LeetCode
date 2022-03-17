package No108;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/17 5:55 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_108 {
    public TreeNode sortedArrayToBST(int[] nums) {

        return toBST(nums, 0, nums.length - 1);
    }

    private TreeNode toBST(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int rootN = (left + right) / 2;
        TreeNode root = new TreeNode(nums[rootN]);
        root.left = toBST(nums, left, rootN - 1);
        root.right = toBST(nums, rootN + 1, right);
        return root;
    }
}
