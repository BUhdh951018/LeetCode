package No114;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/3/16 5:14 下午
 * Description:
 */
public class Recursive_114 {
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;

        TreeNode temp = root;
        while (temp.right != null)
            temp = temp.right;
        temp.right = right;
    }
}
