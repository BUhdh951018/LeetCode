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
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);

        return Math.max(rob(nums, 0, n - 2), rob(nums, 1, n - 1));

    }

    private int rob(int[] nums, int start, int end) {
        int[] dp = new int[nums.length - 1];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2, j = 2; i <= end && j < nums.length - 1; i++, j++) {
            dp[j] = Math.max(dp[j - 2] + nums[i], dp[j - 1]);
        }

        return dp[nums.length - 2];
    }
}
