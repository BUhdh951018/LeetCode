package No876;

public class Count_876 {
    public ListNode middleNode(ListNode head) {
        int len = 0;

        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        int i = 0;
        while (i < len / 2) {
            i++;
            head = head.next;
        }

        return head;
    }
}
