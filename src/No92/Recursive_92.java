package No92;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2023/3/13 8:20 下午
 * Description:
 */
public class Recursive_92 {
    private ListNode successor;
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1)
            return reverseN(head, right);

        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    private ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }

        ListNode temp = reverseN(head, n - 1);
        temp.next.next = temp;
        temp.next = successor;
        return temp;
    }
}
