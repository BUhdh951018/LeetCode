package No337;

import structure.TreeNode;

import java.util.HashMap;

/**
 * Name: Donghang He
 * Date: 2022/3/16 9:35 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_337 {
    private HashMap<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null)
            return 0;

        if (map.containsKey(root))
            return map.get(root);

        int temp = root.val;

        if (root.left != null)
            temp += rob(root.left.left) + rob(root.left.right);

        if (root.right != null)
            temp += rob(root.right.left) + rob(root.right.right);

        int result = Math.max(temp, rob(root.left) + rob(root.right));
        map.put(root, result);
        return result;
    }
}
