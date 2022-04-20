package No494;

/**
 * Name: Donghang He
 * Date: 2022/4/14 6:39 下午
 * Description:
 */
public class DP_494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        /*
            sum(P) - sum(N) = target
            -sum(P) - sum(N) + sum(P) - sum(N) = target - sum(nums)
            sum(N) = (sum - target) / 2
            target 可能小于0，不能使用正数组合
        */
        if (sum < target || (sum - target) % 2 == 1)
            return 0;
        target = (sum - target) / 2;

        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] + dp[i - num];
            }
        }
        return dp[target];
    }
}
