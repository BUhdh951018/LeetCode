package No188;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/20 6:42 下午
 * Description:
 */
public class DP_188 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0)
            return 0;
        int[] buy = new int[k];
        int[] sell = new int[k];
        for (int i = 0; i < k; i++) {
            buy[i] = -prices[0];
            sell[i] = 0;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (j == 0)
                    buy[j] = Math.max(buy[j], -prices[i]);
                else
                    buy[j] = Math.max(buy[j], sell[j - 1] - prices[i]);
                sell[j] = Math.max(sell[j], buy[j] + prices[i]);
            }
        }
        Arrays.sort(sell);
        return sell[k - 1];
    }
}
