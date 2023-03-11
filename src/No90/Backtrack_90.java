package No90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/8 2:35 下午
 * Description:
 */
public class Backtrack_90 {
    private List<List<Integer>> res;
    private LinkedList<Integer> route;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        route = new LinkedList<>();
        Arrays.sort(nums);
        backtrack(nums, 0);
        return res;
    }

    private void backtrack(int[] nums, int start) {
        res.add(new ArrayList<>(route));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1])
                continue;

            route.add(nums[i]);
            backtrack(nums, i + 1);
            route.removeLast();
        }
    }
}
