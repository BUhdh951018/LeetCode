package No714;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/20 6:02 下午
 * Description:
 */
public class DP_714 {
    public int maxProfit(int[] prices, int fee) {
        int buy = -prices[0] - fee, sell = 0;

        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, sell - prices[i] - fee);
            sell = Math.max(sell, buy + prices[i]);
        }

        return sell;
    }
}
