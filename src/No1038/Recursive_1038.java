package No1038;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/2/27 12:55 下午
 * Description:
 */
public class Recursive_1038 {

    private int count = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            count += root.val;
            root.val = count;
            bstToGst(root.left);
        }

        return root;
    }
}
