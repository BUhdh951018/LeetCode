package No234;

import structure.ListNode;

/**
 * Name: Donghang He
 * Date: 2022/3/15 8:23 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Recursive_234 {
    private ListNode frontPointer;

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next))
                return false;
            if (currentNode.val != frontPointer.val)
                return false;
            frontPointer = frontPointer.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {

        frontPointer = head;
        return recursivelyCheck(head);
    }
}
