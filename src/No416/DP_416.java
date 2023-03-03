package No416;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/14 5:30 下午
 * Description:
 */
public class DP_416 {
    public boolean canPartition(int[] nums) {

        int n = nums.length;
        int sum = 0;
        for (int num : nums)
            sum += num;
        Arrays.sort(nums);
        int target = sum / 2;
        if (sum % 2 != 0 || nums[n - 1] > target)
            return false;

        boolean[] dp = new boolean[target + 1];

        dp[0] = true;

        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[target];
    }
}
