package No42;

import java.util.Stack;

public class Stack_42 {
    public int trap(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while (current < height.length) {
            while (!stack.empty() && height[current] > height[stack.peek()]) {
                int temp = height[stack.peek()];
                stack.pop();
                if (stack.empty()){
                    break;
                }
                int distance = current - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[current]);
                sum += distance * (min - temp);
            }
            stack.push(current);
            current++;
        }

        return sum;
    }
}
