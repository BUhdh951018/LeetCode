package No86;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2023/3/5 5:10 下午
 * Description:
 */
public class Double_86 {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1), right = new ListNode(-1);
        ListNode l = left, r = right, h = head;

        while (h != null) {
            if (h.val < x) {
                l.next = h;
                l = l.next;
            } else {
                r.next = h;
                r = r.next;
            }
            ListNode temp = h.next;
            h.next = null;
            h = temp;
        }
        l.next = right.next;
        return left.next;
    }
}
