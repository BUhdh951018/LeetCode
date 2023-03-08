package No46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class backtrack_46 {
    private List<List<Integer>> res;
    private int n;

    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        List<Integer> route = new ArrayList<>();
        n = nums.length;
        boolean[] used = new boolean[n];
        backtrack(nums, used, route);
        return res;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> route) {
        if (route.size() == n) {
            res.add(new ArrayList<>(route));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i]) {
                continue;
            }

            used[i] = true;
            route.add(nums[i]);
            backtrack(nums, used, route);
            route.remove(route.size() - 1);
            used[i] = false;
        }
    }
}
