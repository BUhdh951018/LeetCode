package No155;

import java.util.Stack;

public class MinStack_155 {
    private Stack<Integer> data;
    private Stack<Integer> min;
    private int mini;

    public MinStack_155() {
        data = new Stack<>();
        min = new Stack<>();
        mini = Integer.MAX_VALUE;
    }

    public void push(int x) {
        data.add(x);
        mini = Math.min(mini, x);
        min.add(mini);
    }

    public void pop() {
        data.pop();
        min.pop();
        mini = min.isEmpty() ? Integer.MAX_VALUE : min.peek();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
