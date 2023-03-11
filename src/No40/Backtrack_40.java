package No40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/8 2:43 下午
 * Description:
 */
public class Backtrack_40 {

    private List<List<Integer>> res;
    private LinkedList<Integer> route;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        route = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0);
        return res;
    }

    private void backtrack(int[] can, int target, int sum, int start) {
        if (sum > target)
            return;
        if (sum == target) {
            res.add(new ArrayList<>(route));
            return;
        }

        for (int i = start; i < can.length; i++) {
            if (i > start && can[i] == can[i - 1])
                continue;

            sum += can[i];
            route.add(can[i]);
            backtrack(can, target, sum, i + 1);
            sum -= can[i];
            route.removeLast();
        }
    }
}
