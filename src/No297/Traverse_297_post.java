package No297;

import structure.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Name: Donghang He
 * Date: 2023/3/21 8:13 下午
 * Description:
 */
public class Traverse_297_post {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        traverse(root, sb);
        return sb.toString();
    }

    private void traverse(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null").append(",");
            return;
        }

        traverse(root.left, sb);
        traverse(root.right, sb);
        sb.append(root.val).append(",");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        LinkedList<String> list = new LinkedList<>(Arrays.asList(nodes));
        return build(list);
    }

    private TreeNode build(LinkedList<String> list) {
        if (list.getLast().equals("null")) {
            list.removeLast();
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(list.getLast()));
        list.removeLast();
        root.right = build(list);
        root.left = build(list);
        return root;
    }
}
