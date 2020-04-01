package No141;

public class test_141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = head.next;
        System.out.println(new TwoPoint_141().hasCycle(head));
    }
}
