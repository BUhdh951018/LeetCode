package No98;

import structure.TreeNode;

public class Recursive_98 {
    public boolean isValidBST(TreeNode root) {
        return help(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean help(TreeNode root, long lower, long upper) {
        if (root == null) return true;

        int val = root.val;
        if (val <= lower || val >= upper)
            return false;

        return help(root.left, lower, val) && help(root.right, val, upper);

    }
}
