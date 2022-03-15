package No503;

import java.util.Arrays;
import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/3/14 7:20 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Stack_503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        Stack<Integer> pre = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            int num = nums[i % n];
            while (!pre.isEmpty() && nums[pre.peek()] < num) {
                answer[pre.pop()] = num;
            }
            if (i < n) {
                pre.push(i);
            }
        }
        return answer;
    }
}
