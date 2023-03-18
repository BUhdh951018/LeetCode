package No297;

import structure.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/17 3:26 下午
 * Description:
 */
public class Traverse_297 {

    private final StringBuilder sb = new StringBuilder();

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        serialized(root);
        return sb.toString();
    }

    private void serialized(TreeNode root) {
        if (root == null) {
            sb.append("null").append(",");
            return;
        }

        sb.append(root.val).append(",");
        serialize(root.left);
        serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] tree = data.split(",");
        LinkedList<String> node = new LinkedList<>(Arrays.asList(tree));
        return build(node);
    }

    private TreeNode build(LinkedList<String> node) {
        if (node.getFirst().equals("null")) {
            node.removeFirst();
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(node.getFirst()));
        node.removeFirst();
        root.left = build(node);
        root.right = build(node);

        return root;
    }
}
