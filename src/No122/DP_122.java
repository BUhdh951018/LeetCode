package No122;

/**
 * Name: Donghang He
 * Date: 2022/4/20 7:29 下午
 * Description:
 */
public class DP_122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = -prices[0];
        int sell = 0;
        for (int i = 1; i < n; i++) {
            buy = Math.max(buy, sell - prices[i]);
            sell = Math.max(sell, buy + prices[i]);
        }
        return sell;
    }
}
