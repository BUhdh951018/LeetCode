package No32;

import java.util.Stack;

public class Basic_32 {
    public int longestValidParentheses(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j+=2) {
                if (isVaild(s.substring(i, j))) {
                    max = Math.max(max, j - i);
                }
            }
        }

        return max;
    }

    private boolean isVaild(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (!stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }
}
