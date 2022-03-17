package No669;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/17 4:45 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null)
            return null;
        if (root.val > high)
            return trimBST(root.left, root.val, high);
        if (root.val < low)
            return trimBST(root.right, low, root.val);
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}
