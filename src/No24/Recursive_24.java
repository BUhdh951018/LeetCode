package No24;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2022/3/15 7:30 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode node = head.next;
        head.next = swapPairs(node.next);
        node.next = head;
        return node;
    }
}
