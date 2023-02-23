package No142;

import structure.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hash_142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            if (set.contains(node)){
                return node;
            } else {
                set.add(node);
                node = node.next;
            }
        }

        return null;
    }
}
