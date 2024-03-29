package No746;

/**
 * Name: Donghang He
 * Date: 2022/4/27 5:33 下午
 * Description:
 */
public class DP_746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }

        return Math.min(dp[len - 1], dp[len - 2]);
    }
}
