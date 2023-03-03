package No617;

import structure.TreeNode;

public class Recursive_617 {
    public TreeNode mergeTree(TreeNode t1, TreeNode t2) {


        if (t1 == null){
            return t2;
        }
        if (t2 == null){
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTree(t1.left, t2.left);
        t1.right = mergeTree(t1.right, t2.right);

        return t1;
    }
}
