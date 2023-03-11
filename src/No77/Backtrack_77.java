package No77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/8 2:17 下午
 * Description:
 */
public class Backtrack_77 {
    private List<List<Integer>> res;
    private LinkedList<Integer> route;

    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        route = new LinkedList<>();
        backtrack(n, k, 1);
        return res;
    }

    private void backtrack(int n, int k, int start) {
        if (route.size() == k) {
            res.add(new ArrayList<>(route));
            return;
        }

        for (int i = start; i <= n; i++) {
            route.add(i);
            backtrack(n, k, i + 1);
            route.removeLast();
        }
    }
}
