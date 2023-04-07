package No382;

import structure.ListNode;

import java.util.Random;

/**
 * Name: Donghang He
 * Date: 2023/4/6 5:23 下午
 * Description:
 */
public class Solution {
    private final ListNode head;
    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        Random r = new Random();
        int i = 0, res = 0;
        ListNode node = head;
        while (node != null) {
            i++;
            if (0 == r.nextInt(i)) {
                res = node.val;
            }
            node = node.next;
        }
        return res;
    }
}
