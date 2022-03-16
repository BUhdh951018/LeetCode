package No21;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2022/3/15 6:06 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
