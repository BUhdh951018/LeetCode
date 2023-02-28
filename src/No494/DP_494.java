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
            p 是添加+的元素，n 是添加-的元素
            sum(P) - sum(N) = target
            (sum - sumN) - sumN = target
            sum(N) = (sum - target) / 2
            sunN为非负整数，所以sum-target必为非负偶数
        */
        if (sum < target || (sum - target) % 2 == 1)
            return 0;
        int sumN = (sum - target) / 2;

        int[] dp = new int[sumN + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = sumN; i >= num; i--) {
                dp[i] = dp[i] + dp[i - num];
            }
        }
        return dp[sumN];
    }
}
