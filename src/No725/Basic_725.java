package No725;

import structure.ListNode;
/**
 * Name: Donghang He
 * Date: 2022/3/15 8:48 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Basic_725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        int mod = len % k;
        int size = len / k;
        cur = head;
        for (int i = 0 ; cur != null && i < k; i++) {
            result[i] = cur;
            int curSize = size + (mod-- >0 ? 1 : 0);
            for (int j = 0; j < curSize - 1; j++) {
                cur = cur.next;
            }

            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }

        return result;
    }
}
