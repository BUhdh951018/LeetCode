package No92;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2023/3/13 8:28 下午
 * Description:
 */
public class Iteration_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1, head);
        int l = left;
        while (left-- > 1) {
            dummy = dummy.next;
        }

        ListNode cur = dummy.next;
        while (right - l > 0) {
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = dummy.next;
            dummy.next = next;
            cur = cur.next;
            right--;
        }

        return head;
    }
}
