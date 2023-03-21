package No450;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/3/20 3:02 下午
 * Description:
 */
public class Recursive_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.val == key) {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            TreeNode min = getMin(root.right);
            root.right = deleteNode(root.right, min.val);
            min.left = root.left;
            min.right = root.right;
            root = min;
        } else if (root.val < key) {
            root.right =  deleteNode(root.right, key);
        } else
            root.left = deleteNode(root.left, key);
        return root;
    }

    private TreeNode getMin(TreeNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }
}
