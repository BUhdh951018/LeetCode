package No160;

import structure.ListNode;

public class test_160 {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        ListNode temp = new ListNode(8);
        headA.next.next = temp;
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(0);
        headB.next.next = temp;
        temp.next = new ListNode(4);
        System.out.println(new TwoPoint_160().getIntersectionNode(headA, headB).val);
    }
}
