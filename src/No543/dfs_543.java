package No543;

public class dfs_543 {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        ans = Math.max(ans, l+r);
        return Math.max(l, r) + 1;
    }
}
