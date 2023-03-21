package No701;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/3/20 2:57 下午
 * Description:
 */
public class Recursive_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);

        int cur = root.val;
        if (cur < val)
            root.right =  insertIntoBST(root.right, val);
        else
            root.left =  insertIntoBST(root.left, val);
        return root;
    }
}
