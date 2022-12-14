package No225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Name: Donghang He
 * Date: 2022/3/14 6:09 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class MyStack {
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        int temp = queue.size();
        System.out.println(temp);
        while (temp-- > 1) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
