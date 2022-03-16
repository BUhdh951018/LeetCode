package No19;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2022/3/15 7:19 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class TwoPoint_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        while (n-- > 0) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
