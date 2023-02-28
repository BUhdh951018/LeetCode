package No543;

import structure.TreeNode;

public class Recursive_543 {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode root) {
        if (root == null)
            return 0;
        int l = dfs(root.left); //左子树深度
        int r = dfs(root.right);//右子树深度
        ans = Math.max(ans, l+r);//当前最大宽度
        return Math.max(l, r) + 1;//结点最大深度
    }
}
