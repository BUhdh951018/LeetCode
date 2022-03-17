package No109;

import structure.ListNode;
import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/17 6:03 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_109 {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return new TreeNode(head.val);
        ListNode pre = midNode(head);
        ListNode mid = pre.next;
        pre.next = null;
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        return root;
    }

    private ListNode midNode(ListNode node) {
        ListNode pre = node;
        ListNode first = node, second = node.next;
        while (second != null && second.next != null) {
            pre = first;
            first = first.next;
            second = second.next.next;
        }

        return pre;
    }
}
