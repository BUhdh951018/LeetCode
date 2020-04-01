package No155;

import java.util.Stack;

public class MinStack_155 {
    private Stack<Integer> data;
    private Stack<Integer> min;

    public MinStack_155() {
        data = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        data.add(x);
        if (min.isEmpty() || min.peek() >= x) {
            min.add(x);
        } else {
            min.add(min.peek());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            int top = data.pop();
            if (top == min.peek()) {
                min.pop();
            }
        }
    }

    public int top() {
        if (!data.isEmpty()) {
            return data.peek();
        }
        return 0;
    }

    public int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        }
        return 0;
    }
}
