package No652;

import structure.TreeNode;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/17 3:54 下午
 * Description:
 */
public class Traverse_652 {

    private final Map<String, Integer> seen = new HashMap<>();
    private List<TreeNode> res;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        res = new ArrayList<>();
        traverse(root);
        return new ArrayList<>(res);
    }

    private String traverse(TreeNode root) {
        if (root == null)
            return "null";

        String left = traverse(root.left);
        String right = traverse(root.right);

        String curTree = left + "," + right + "," + root.val;

        if (seen.getOrDefault(curTree, 0) == 1)
            res.add(root);

        seen.put(curTree, seen.getOrDefault(curTree, 0) + 1);
        return curTree;
    }
}
