package No232;

/**
 * Name: Donghang He
 * Date: 2022/3/14 5:45 下午
 * Course: CS-
 * Assignment
 * Description:
 */

import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

public class MyQueue {
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        inToOut();
        return out.pop();
    }

    public int peek() {
        inToOut();
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }

    private void inToOut() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
}
