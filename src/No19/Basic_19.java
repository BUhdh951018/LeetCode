package No19;

import structure.ListNode;
import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2022/3/15 6:48 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Basic_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        int len = 0;
        ListNode start = head;
        while (start != null) {
            len++;
            start = start.next;
        }
        start = head;
        if (n == len) {
            return head.next;
        }
        while (start != null) {
            len--;
            if (len == n) {
                start.next = start.next.next;
            } else {
                start = start.next;
            }
        }

        return head;
    }
}
