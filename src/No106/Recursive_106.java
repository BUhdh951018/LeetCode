package No106;

import structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2023/3/16 6:17 下午
 * Description:
 */
public class Recursive_106 {

    private int postIndex;
    private final Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        int i = 0;
        for (int node : inorder)
            map.put(node, i++);

        return buildTree(postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] postorder, int left, int right) {
        if (left > right)
            return null;
        int val = postorder[postIndex--];
        int index = map.get(val);

        TreeNode root = new TreeNode(val);
        root.right = buildTree(postorder, index + 1, right);
        root.left = buildTree(postorder, left, index - 1);

        return root;
    }
}
