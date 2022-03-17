package No144;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/3/17 4:13 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Iterate_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null)
                continue;
            ans.add(node.val);
            stack.push(node.right);
            stack.push(node.left);
        }

        return ans;
    }
}
