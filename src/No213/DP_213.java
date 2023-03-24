package No213;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/3/24 6:00 下午
 * Description:
 */
public class DP_213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);
        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));
    }

    private int rob(int[] nums, int start, int end) {
        int dp_i_0 = nums[start], dp_i_1 = Math.max(nums[start], nums[start + 1]);
        int res = Math.max(dp_i_0, dp_i_1);

        for (int i = start + 2; i <= end; i++) {
            res = Math.max(dp_i_1, nums[i] + dp_i_0);
            dp_i_0 = dp_i_1;
            dp_i_1 = res;
        }

        return res;
    }
}
