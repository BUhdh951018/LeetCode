package No230;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/17 5:16 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_230 {
    public int kthSmallest(TreeNode root, int k) {
        int count = count(root.left) + 1;
        if (count == k)
            return root.val;
        if (count > k)
            return kthSmallest(root.left, k);
        return kthSmallest(root.right, k - count);
    }

    private int count(TreeNode node) {
        if (node == null)
            return 0;
        return 1 + count(node.left) + count(node.right);
    }
}
