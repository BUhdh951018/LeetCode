package No83;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2022/3/15 6:27 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Iterate_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode preHead = head;
        while (preHead.next != null) {
            if (preHead.val == preHead.next.val) {
                preHead.next = preHead.next.next;
            } else {
                preHead = preHead.next;
            }
        }
        return head;
    }
}
