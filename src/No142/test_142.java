package No142;

public class test_142 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = head.next;
        System.out.println(new Floyd_142().detectCycle(head).val);
    }
}
