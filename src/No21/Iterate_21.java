package No21;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2022/3/15 6:15 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Iterate_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode head = newHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return newHead.next;
    }
}
