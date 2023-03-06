package No2;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2023/2/14 3:27 下午
 * Description:
 */
public class List_2 {
    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        if (carry == 1)
            temp.next = new ListNode(carry);

        return result.next;
    }
}
