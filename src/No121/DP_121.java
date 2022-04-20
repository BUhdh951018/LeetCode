package No121;

/**
 * Name: Donghang He
 * Date: 2022/4/20 7:18 下午
 * Description:
 */
public class DP_121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = -prices[0];
        int sell = 0;
        for (int i = 1; i < n; i++) {
            buy = Math.max(buy, -prices[i]);
            sell = Math.max(sell, buy + prices[i]);
        }
        return sell;
    }
}
