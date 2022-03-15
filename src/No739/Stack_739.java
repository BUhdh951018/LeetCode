package No739;

import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/3/14 6:51 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Stack_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int temp = stack.pop();
                answer[temp] = i - temp;
            }
            stack.add(i);
        }

        return answer;
    }
}
