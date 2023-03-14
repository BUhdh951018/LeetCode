package No23;

import structure.ListNode;

import java.util.PriorityQueue;

/**
 * Name: Donghang He
 * Date: 2023/3/13 7:51 下午
 * Description:
 */
public class Double_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode node = new ListNode(-1);
        ListNode temp = node;

        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> (a.val - b.val));

        for (ListNode n : lists) {
            if (n != null)
                queue.add(n);
        }

        while (!queue.isEmpty()) {
            ListNode cur = queue.poll();
            temp.next = cur;
            if (cur.next != null)
                queue.add(cur.next);

            temp = temp.next;
        }
        return node.next;
    }
}
