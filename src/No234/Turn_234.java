package No234;

public class Turn_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;

        ListNode pre = null, temp = null;

        while (fast != null && fast.next != null) {
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;

            temp.next = pre;
            pre = temp;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (pre != null) {
            if (pre.val != slow.val) {
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }

        return true;
    }
}
