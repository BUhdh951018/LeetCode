package No297;

import structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2023/3/21 8:20 下午
 * Description:
 */
public class Traverse_297_level {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                sb.append("null").append(",");
                continue;
            }
            sb.append(cur.val).append(",");
            queue.offer(cur.left);
            queue.offer(cur.right);
        }
        return sb.toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null)
            return null;
        String[] nodes = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < nodes.length; i++) {
            TreeNode cur = queue.poll();
            String left = nodes[i++];
            if (!left.equals("null")) {
                cur.left = new TreeNode(Integer.parseInt(left));
                queue.offer(cur.left);
            } else
                cur.left = null;

            String right = nodes[i++];
            if (!right.equals("null")) {
                cur.right = new TreeNode(Integer.parseInt(right));
                queue.offer(cur.right);
            } else
                cur.right = null;
        }

        return root;
    }

}
