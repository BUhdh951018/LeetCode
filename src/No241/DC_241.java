package No241;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2023/4/9 6:33 下午
 * Description:
 */
public class DC_241 {
    private final Map<String, List<Integer>> map = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if (map.containsKey(expression))
            return map.get(expression);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char cur = expression.charAt(i);
            if (cur == '-' || cur == '+' || cur == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

                for (int l : left) {
                    for (int r : right) {
                        if (cur == '-')
                            res.add(l - r);
                        else if (cur == '+')
                            res.add(l + r);
                        else
                            res.add(l * r);
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        map.put(expression, res);
        return res;
    }
}
