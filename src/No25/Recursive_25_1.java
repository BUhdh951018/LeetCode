package No25;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2023/3/14 5:52 下午
 * Description:
 */
public class Recursive_25_1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null)
            return null;

        ListNode a = head, b = head;
        int count = k;
        while (count-- > 0) {
            if (b == null)
                return head;
            b = b.next;
        }

        ListNode res = reverse(a, b);

        a.next = reverseKGroup(b, k);
        return res;
    }

    private ListNode reverse(ListNode a, ListNode b) {
        ListNode pre = null;

        while (a != b) {
            ListNode temp = a;
            a = a.next;
            temp.next = pre;
            pre = temp;
        }

        return pre;
    }
}
