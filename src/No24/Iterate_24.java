package No24;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2022/3/15 7:39 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Iterate_24 {
    public ListNode swapPairs(ListNode head) {

        ListNode node = new ListNode(-1, head);
        ListNode pre = node;
        while (pre.next != null && pre.next.next != null) {
            ListNode l1 = pre.next, l2 = pre.next.next;
            l1.next = l2.next;
            l2.next = l1;
            pre.next = l2;
            pre = l1;
        }
        return node.next;
    }
}
