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

        ListNode node = head;

        while (node != null && node.next != null) {
            if (node.val == node.next.val)
                node.next = node.next.next;
            else {
                node = node.next;
            }
        }

        return head;
    }
}
