package No25;

import structure.ListNode;

import java.util.List;

public class Recursive_25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode pre = new ListNode(0);
        pre.next = head;

        ListNode start = pre;
        ListNode end = head;

        int count = 0;
        while (end != null) {
            count++;

            if (count % k == 0){
                start = reverse(start, end.next);
                end = start.next;
            } else {
                end = end.next;
            }
        }

        return pre.next;
    }

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode curr = start.next;
        ListNode prev = start;
        ListNode first = curr;

        while (curr != end) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        start.next = prev;
        first.next = curr;
        return first;
    }
}
