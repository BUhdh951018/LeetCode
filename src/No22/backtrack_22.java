package No22;

import java.util.ArrayList;
import java.util.List;

public class backtrack_22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(n, n, res, sb);
        return res;
    }

    private void backtrack(int left, int right, List<String> res, StringBuilder sb) {
        if (right < left)
            return;
        if (left < 0)
            return;
        if (left == 0 && right == 0) {
            res.add(sb.toString());
            return;
        }
        sb.append('(');
        backtrack(left - 1, right, res, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        backtrack(left, right - 1, res, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
