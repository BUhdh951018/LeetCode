package No316;

import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2023/3/21 7:41 下午
 * Description:
 */
public class Stack_316 {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();

        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i)]++;

        boolean[] inStack = new boolean[256];
        for (char c : s.toCharArray()) {
            count[c]--;

            if (inStack[c])
                continue;

            while (!stack.isEmpty() && stack.peek() > c) {
                // 若之后不存在栈顶元素了，则停止 pop
                if (count[stack.peek()] == 0)
                    break;
                // 若之后还有，则可以 pop
                inStack[stack.pop()] = false;
            }


            stack.push(c);
            inStack[c] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());

        return sb.reverse().toString();
    }
}
