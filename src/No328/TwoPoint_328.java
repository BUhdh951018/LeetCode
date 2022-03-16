package No328;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2022/3/15 9:04 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class TwoPoint_328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
