package No206;

import structure.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/15 5:15 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Iterate_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = node.next;
            node.next = head;
            head = next;
        }
        List<Integer> list = new ArrayList<>();
        return node.next;
    }
}
