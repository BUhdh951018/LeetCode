package No700;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/3/20 2:44 下午
 * Description:
 */
public class Recursive_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        int cur = root.val;

        if (cur == val)
            return root;
        if (cur < val)
            return searchBST(root.right, val);
        else
            return searchBST(root.left, val);
    }
}
