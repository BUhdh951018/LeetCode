package No114;

import structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class preorder_114 {
    // LinkedList removeFirst方法
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        LinkedList<TreeNode> list = new LinkedList<>();
        dfs(list, root);
        list.removeFirst();

        while (!list.isEmpty()) {
            root.left = null;
            root.right = list.removeFirst();
            root = root.right;
        }
    }

    private void dfs(LinkedList<TreeNode> list, TreeNode root) {
        if (root == null) {
            return;
        }

        list.add(root);
        dfs(list, root.left);
        dfs(list, root.right);
    }
}
