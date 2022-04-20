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
        if (n < 2)
            return false;
        int sum = 0;
        for (int num : nums)
            sum += num;
        if (sum % 2 != 0)
            return false;
        Arrays.sort(nums);
        sum = sum / 2;
        if (nums[n - 1] > sum)
            return false;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = sum; i >= 1; i--) {
                if (i >= num)
                    dp[i] = dp[i] || dp[i - num];
            }
        }


        return dp[sum];
    }
}
