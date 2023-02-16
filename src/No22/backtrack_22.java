package No22;

import java.util.ArrayList;
import java.util.List;

public class backtrack_22 {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    public static void backtrack(List<String> result, String temp, int start, int end, int max) {
        if (temp.length() == max * 2) {
            result.add(temp);
            return;
        }

        if (end < start) {
            backtrack(result, temp + ")", start, end + 1, max);
        }

        if (start < max) {
            backtrack(result, temp + "(", start + 1, end, max);
        }

    }

    public static void main (String[] args) {
        List<String> result = new ArrayList();
        result = generateParenthesis(3);
        System.out.println(result);
        System.out.println(result.size());
    }
}
