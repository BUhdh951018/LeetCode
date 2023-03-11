package No111;

import structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2023/3/8 4:12 下午
 * Description:
 */
public class BFS_111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 1;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null)
                    return depth;

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            depth++;
        }

        return depth;
    }
}
