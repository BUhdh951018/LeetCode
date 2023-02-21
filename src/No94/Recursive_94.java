package No94;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/2/20 3:06 下午
 * Description:
 */
public class Recursive_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursive(root, result);
        return result;
    }

    private void recursive(TreeNode node, List<Integer> result) {
        if (node == null)
            return;
        recursive(node.left, result);
        result.add(node.val);
        recursive(node.right, result);
    }
}
