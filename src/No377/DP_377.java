package No377;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/20 5:08 下午
 * Description:
 */
public class DP_377 {
    public int combinationSum4(int[] nums, int target) {
        
        int[] dp = new int[target + 1];
        dp[0] = 1;
        Arrays.sort(nums);
        for (int i = 1; i <= target; i++)
            for (int j = 0; j < nums.length && nums[j] <= i; j++) {
                dp[i] += dp[i - nums[j]];
            }
        return dp[target];
    }
}
