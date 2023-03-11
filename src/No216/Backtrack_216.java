package No216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/8 3:23 下午
 * Description:
 */
public class Backtrack_216 {

    private List<List<Integer>> res;
    private LinkedList<Integer> route;

    public List<List<Integer>> combinationSum3(int k, int n) {
        res = new ArrayList<>();
        route = new LinkedList<>();
        backtrack(k, n, 1);
        return res;
    }

    private void backtrack(int k, int target, int start) {
        if (target < 0)
            return;
        if (route.size() == k && target == 0) {
            res.add(new ArrayList<>(route));
            return;
        }

        for (int i = start; i < 10; i++) {
            if (i > target)
                break;

            route.add(i);
            backtrack(k, target - i, i + 1);
            route.removeLast();
        }
    }
}
