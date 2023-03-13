package No18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/13 6:49 下午
 * Description:
 */
public class Double_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int a = 0; a < n; a++) {
            if (a > 0 && nums[a] == nums[a - 1])
                continue;
            long targetA = target - nums[a];

            for (int b = a + 1; b < n; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1])
                    continue;
                long targetB = targetA - nums[b];
                int d = n - 1;

                for (int c = b + 1; c < n; c++) {
                    if (c > b + 1 && nums[c] == nums[c - 1])
                        continue;

                    while (c < d &&(long) nums[c] + nums[d] > targetB)
                        d--;
                    if (c == d)
                        break;
                    if ((long)nums[c] + nums[d] == targetB) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[a]);
                        temp.add(nums[b]);
                        temp.add(nums[c]);
                        temp.add(nums[d]);
                        res.add(temp);
                    }
                }
            }
        }
        return res;
    }
}
