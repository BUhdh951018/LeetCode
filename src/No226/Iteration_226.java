package No226;

import structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Iteration_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            TreeNode temp = curr.right;
            curr.right = curr.left;
            curr.left = temp;

            if (curr.left != null)
                queue.add(curr.left);
            if (curr.right != null)
                queue.add(curr.right);
        }

        return root;
    }
}
