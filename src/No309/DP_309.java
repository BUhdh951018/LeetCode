package No309;

/**
 * Name: Donghang He
 * Date: 2022/4/20 5:33 下午
 * Description:
 */

public class DP_309 {
    public int maxProfit(int[] prices) {
        int buy = -prices[0];
        int sell1 = 0;
        int sell2 = 0;

        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, sell2 - prices[i]);
            sell2 = Math.max(sell1, sell2);
            sell1 = Math.max(sell1, buy + prices[i]);
        }

        return Math.max(sell1, sell2);
    }
}
