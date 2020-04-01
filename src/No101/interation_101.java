package No101;

import java.util.LinkedList;
import java.util.Queue;

public class interation_101 {
    public boolean isSymmetric(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode root1 = queue.poll();
            TreeNode root2 = queue.poll();
            if (root1 == null && root2 == null)
                continue;
            if (root1 == null || root2 == null)
                return false;
            if (root1.val != root2.val)
                return false;
            queue.add(root1.left);
            queue.add(root2.right);
            queue.add(root1.right);
            queue.add(root2.left);
        }
        return true;
    }

}
