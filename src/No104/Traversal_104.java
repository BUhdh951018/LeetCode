package No104;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/3/6 4:35 下午
 * Description:
 */
public class Traversal_104 {
    private int depth = 0;
    private int ans = 0;
    public int maxDepth(TreeNode root) {
        traverse(root);
        return ans;
    }

    private void traverse(TreeNode root) {
        if (root == null)
            return;

        depth++;
        if (root.left == null && root.right == null)
            ans = Math.max(ans, depth);

        traverse(root.left);
        traverse(root.right);
        depth--;
    }
}
