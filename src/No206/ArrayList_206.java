package No206;

import structure.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/15 6:37 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class ArrayList_206 {
    public ListNode reverseList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        ListNode result = new ListNode(-1);
        ListNode ans = result;
        for (int temp : list) {
            ans.next = new ListNode(temp);
            ans = ans.next;
        }
        return result.next;
    }
}
