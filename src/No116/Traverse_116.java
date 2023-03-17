package No116;

import structure.Node;
import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/3/16 5:02 下午
 * Description:
 */
public class Traverse_116 {
    public Node connect(Node root) {
        if (root == null)
            return null;
        traverse(root.left, root.right);
        return root;
    }

    public void traverse(Node node1, Node node2) {
        if (node1 == null || node2 == null)
            return;

        node1.next = node2;

        traverse(node1.left, node1.right);
        traverse(node2.left, node2.right);
        traverse(node1.right, node2.left);
    }
}
