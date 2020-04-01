package No160;

public class TwoPoint_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA, pb = headB;
        while (pa != pb) {
            /*pa = pa != null ? pa.next : headB;
            pb = pb != null ? pb.next : headA;*/
            if (pa != null) {
                pa = pa.next;
            } else {
                pa = headB;
            }
            if (pb != null) {
                pb = pb.next;
            } else {
                pb = headA;
            }
        }
        return pa;
    }
}
