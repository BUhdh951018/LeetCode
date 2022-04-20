package No309;

/**
 * Name: Donghang He
 * Date: 2022/4/20 5:33 下午
 * Description:
 */
public class DP_309 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
//        int[][] dp = new int[n][3];
//        dp[0][0] = -prices[0];
//        dp[0][1] = 0;
//        dp[0][2] = 0;
//
//        for (int i = 1; i < n; i++) {
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);
//            dp[i][1] = dp[i - 1][0] + prices[i];
//            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);
//        }
//
//        return Math.max(dp[n - 1][1], dp[n - 1][2]);
        int[] buy = new int[n];
        int[] sell1 = new int[n];
        int[] sell2 = new int[n];
        buy[0] = -prices[0];
        sell1[0] = 0;
        sell2[0] = 0;
        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i - 1], sell2[i - 1] - prices[i]);
            sell1[i] = buy[i - 1] + prices[i];
            sell2[i] = Math.max(sell1[i - 1], sell2[i - 1]);
        }

        return Math.max(sell1[n - 1], sell2[n - 1]);
    }
}
