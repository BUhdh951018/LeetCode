package Offer9;

import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/3/22 4:53 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Stack_9 {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public Stack_9() {

    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        inToOut();
        if (out.isEmpty())
            return -1;
        return out.pop();
    }

    private void inToOut() {
        if (out.isEmpty()) {
            while (!in.isEmpty())
                out.push(in.pop());
        }
    }
}
