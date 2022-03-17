package No145;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/3/17 4:22 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Iterate_145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null)
                continue;

            ans.add(node.val);
            stack.push(node.left);
            stack.push(node.right);
        }

        Collections.reverse(ans);
        return ans;
    }
}
