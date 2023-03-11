package No47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/8 2:52 下午
 * Description:
 */
public class Backtrack_47 {

    private List<List<Integer>> res;
    private LinkedList<Integer> route;
    private boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        res = new ArrayList<>();
        route = new LinkedList<>();
        used = new boolean[len];
        Arrays.sort(nums);
        backtrack(nums);
        return res;
    }

    private void backtrack(int[] nums) {
        if (route.size() == nums.length) {
            res.add(new ArrayList<>(route));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            route.add(nums[i]);
            backtrack(nums);
            route.removeLast();
            used[i] = false;
        }
    }
}
