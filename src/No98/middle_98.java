package No98;

import apple.laf.JRSUIUtils;

import java.util.Stack;

public class middle_98 {
    public boolean isValidBST(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        double inorder = - Double.MAX_VALUE;
        while(root != null || !stack.isEmpty()){
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.val <= inorder)
                return false;
            inorder = root.val;
            root = root.right;
        }

        return true;
    }
}
