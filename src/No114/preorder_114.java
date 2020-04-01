package No114;

import java.util.LinkedList;
import java.util.List;

public class preorder_114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<TreeNode> list = new LinkedList<>();

        dfs(root, list);
        TreeNode head = list.removeFirst();
        head.left = null;

        while (list.size() > 0) {
            TreeNode temp = list.removeFirst();
            temp.left = null;
            head.right = temp;
            head = head.right;
        }
    }

    private void dfs(TreeNode root, LinkedList<TreeNode> list) {
        if (root == null) {
            return;
        }

        list.add(root);
        dfs(root.left, list);
        dfs(root.right,list);
    }
}
