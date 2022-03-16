package No19;

import structure.ListNode;

import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/3/15 7:12 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Stack_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = temp;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        int i = 0;
        while (i < n) {
            i++;
            stack.pop();
        }
        ListNode node = stack.peek();
        node.next = node.next.next;
        return temp.next;
    }
}
