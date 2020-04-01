package No98;

public class iteration_98 {
    public boolean isValidBST(TreeNode root) {
        return help(root, null, null);
    }

    public boolean help(TreeNode root, Integer lower, Integer upper) {
        if (root == null) return false;

        int val = root.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!help(root.left, lower, val)) return false;
        if (!help(root, val, upper)) return false;

        return true;
    }
}
