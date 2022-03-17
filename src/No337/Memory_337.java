package No337;

import structure.TreeNode;

import java.util.HashMap;

public class Memory_337 {
    public int rob(TreeNode root) {
        HashMap<TreeNode, Integer> memo = new HashMap<>();
        return memory(root, memo);
    }

    private int memory(TreeNode root, HashMap<TreeNode, Integer>memo) {
        if (root == null)
            return 0;
        if (memo.containsKey(root))
            return memo.get(root);
        int money = root.val;

        if (root.left != null) {
            money += memory(root.left.left, memo) + memory(root.left.right, memo);
        }

        if (root.right != null) {
            money += memory(root.right.left, memo) + memory(root.right.right, memo);
        }

        int result = Math.max(money, memory(root.left, memo) + memory(root.right, memo));
        memo.put(root, result);
        return result;
    }
}
