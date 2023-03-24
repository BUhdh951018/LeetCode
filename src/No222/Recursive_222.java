package No222;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2023/3/21 4:08 下午
 * Description:
 */
public class Recursive_222 {
    public int countNodes(TreeNode root) {
        TreeNode l = root, r = root;

        int hL = 0, hR = 0;
        while (l != null) {
            hL++;
            l = l.left;
        }

        while (r != null) {
            hR++;
            r = r.right;
        }

        if (hL == hR)
            return (int) Math.pow(2, hL) - 1;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
