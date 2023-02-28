package No337;

import structure.TreeNode;

import java.util.HashMap;

public class DP_337_2 {
    private final HashMap<TreeNode, Integer> s = new HashMap<>();
    private final HashMap<TreeNode, Integer> n = new HashMap<>();
    public int rob(TreeNode root) {
        dfs(root);
        return Math.max(s.get(root), n.get(root));
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;

        dfs(root.left);
        dfs(root.right);
        s.put(root, root.val + n.getOrDefault(root.left, 0) + n.getOrDefault(root.right, 0));
        n.put(root, Math.max(s.getOrDefault(root.left, 0), n.getOrDefault(root.left, 0)) +
                Math.max(s.getOrDefault(root.right, 0), n.getOrDefault(root.right, 0)));
    }

}
