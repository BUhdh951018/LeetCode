package No142;

import structure.ListNode;

import java.util.List;

public class Double_142 {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head, slow = head;
        do {
            if (fast == null || fast.next == null)
                return null;
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != slow);;

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
