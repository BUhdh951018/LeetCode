package No102;

import java.util.List;

public class test_102 {
    public static void main(String[] args){
        TreeNode root = new No102.TreeNode(3);
        root.left = new No102.TreeNode(9);
        root.right = new No102.TreeNode(20);
        root.right.left = new No102.TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> ans = new iteration_102().levelOrder(root);
        System.out.println(ans);
    }
}
