package No300;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/5/10 8:02 下午
 * Description:
 */
public class DP_300_1 {
    //time: O(n^2)
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;

        for (int i = 1; i < len; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        Arrays.sort(dp);
        return dp[len - 1];
    }
}
