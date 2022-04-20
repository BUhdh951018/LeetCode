package No714;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/20 6:02 下午
 * Description:
 */
public class DP_714 {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] buy = new int[n];
        int[] sell = new int[n];
        buy[0] = -prices[0];
        sell[0] = 0;
        for (int i = 1; i < n; i++) {
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] - fee + prices[i]);
        }
        return sell[n - 1];
    }
}
