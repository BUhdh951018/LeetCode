package No889;

import structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2023/3/16 6:30 下午
 * Description:
 */
public class Recursive_889 {

    private int postIndex = 0;
    private final Map<Integer, Integer> map = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int i = 0;
        for (int node : postorder)
            map.put(node, i++);

        return construct(preorder, 0, preorder.length - 1);
    }

    private TreeNode construct(int[] preorder,int preL, int preR) {
        if (preL > preR)
            return null;

        int val = preorder[preL];
        TreeNode root = new TreeNode(val);
        if (preL == preR)
            return root;

        int leftVal = preorder[preL + 1];
        int leftIndex = map.get(leftVal);
        int leftSize = leftIndex - postIndex + 1;

        root.left = construct(preorder, preL + 1, preL + leftSize);
        postIndex = leftIndex + 1;
        root.right = construct(preorder,preL + leftSize + 1, preR);

        return root;
    }
}
