package No105;

import java.util.HashMap;

public class recursion_105 {
    int pre_idx = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int idx = 0;
        for (Integer val: inorder) {
            map.put(val, idx++);
        }

        return helper(0, inorder.length, preorder, inorder);
    }

    private TreeNode helper(int left, int right, int[] preorder, int[] inorder) {

        if (left == right) {
            return null;
        }

        int val = preorder[pre_idx];
        TreeNode root = new TreeNode(val);
        pre_idx++;

        int index = map.get(val);
        root.left = helper(left, index, preorder, inorder);
        root.right = helper(index + 1, right, preorder, inorder);
        return root;
    }
}
