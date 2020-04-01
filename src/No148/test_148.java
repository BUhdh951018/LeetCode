package No148;

public class test_148 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 0, 3, 4, 7, 5};
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i = 0; i < nums.length; i++) {
            head.next = new ListNode(nums[i]);
            head = head.next;
        }

        ListNode ans = new two_148().sortList(temp.next);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
