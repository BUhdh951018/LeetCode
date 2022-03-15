package No20;

import java.util.Stack;

/**
 * Name: Donghang He
 * Date: 2022/3/14 6:38 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Stack_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char temp = stack.pop();
                boolean b1 = c == ')' && temp != '(';
                boolean b2 = c == '}' && temp != '{';
                boolean b3 = c == ']' && temp != '[';
                if (b1 || b2 || b3) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
