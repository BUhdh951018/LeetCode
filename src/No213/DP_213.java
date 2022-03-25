package No213;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/3/24 6:00 下午
 * Description:
 */
public class DP_213 {
    public int rob(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);

        return Math.max(rob(nums, 0, n - 2),
                rob(nums, 1, n - 1));
    }

    private int rob(int[] nums, int start, int end) {
        int[] dp = new int[nums.length + 2];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = start; i <= end; i++) {
            int j = i + 2;
            dp[j] = Math.max(nums[i] + dp[j - 2], dp[j - 1]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[nums.length + start];
    }
}
