package No105;

import structure.TreeNode;

import java.util.HashMap;

public class Recursive_105 {
    int pre_idx = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int idx = 0;
        for (Integer val: inorder) {
            map.put(val, idx++);
        }

        return helper(0, inorder.length - 1, preorder);
    }

    private TreeNode helper(int left, int right, int[] preorder) {

        if (left > right) {
            return null;
        }

        int val = preorder[pre_idx++];
        int index = map.get(val);

        TreeNode root = new TreeNode(val);
        root.left = helper(left, index - 1, preorder);
        root.right = helper(index + 1, right, preorder);
        return root;
    }
}
