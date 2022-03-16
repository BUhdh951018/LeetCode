package No160;

import structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Name: Donghang He
 * Date: 2022/3/15 5:07 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class HashSet_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode a = headA, b = headB;
        while (a != null) {
            set.add(a);
            a = a.next;
        }

        while (b != null) {
            if (set.contains(b)) {
                return b;
            }
            b = b.next;
        }
        return null;
    }
}
