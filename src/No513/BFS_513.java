package No513;

import structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2022/3/17 3:34 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class BFS_513 {

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null)
                queue.add(root.right);
            if (root.left != null)
                queue.add(root.left);
        }

        return root.val;
    }
}
