package No206;

import structure.ListNode;

public class Recursion_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return cur;
    }
}
