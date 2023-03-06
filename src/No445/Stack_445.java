package No445;

import structure.ListNode;

import java.util.Stack;

public class Stack_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = save(l1);
        Stack<ListNode> stack2 = save(l2);
        int carry = 0;
        ListNode node = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = carry;
            sum += stack1.isEmpty() ? 0 : stack1.pop().val;
            sum += stack2.isEmpty() ? 0 : stack2.pop().val;
            node = new ListNode(sum % 10, node);
            carry = sum / 10;
        }

        if (carry == 1) {
            node = new ListNode(1, node);
        }

        return node;
    }

    private Stack<ListNode> save (ListNode l) {
        Stack<ListNode> stack = new Stack<>();
        while (l != null) {
            stack.push(l);
            l = l.next;
        }

        return stack;
    }
}
