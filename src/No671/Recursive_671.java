package No671;

import structure.TreeNode;

/**
 * Name: Donghang He
 * Date: 2022/3/16 10:09 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_671 {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null)
            return -1;
        if (root.left == null && root.right == null)
            return -1;

        int leftVal = root.left.val;
        int rightVal = root.right.val;

        if (leftVal == root.val)
            leftVal = findSecondMinimumValue(root.left);
        if (rightVal == root.val)
            rightVal = findSecondMinimumValue(root.right);

        if (leftVal != -1 && rightVal != -1)
            return Math.min(leftVal, rightVal);
        if (leftVal != -1)
            return leftVal;
        return rightVal;
    }
}
