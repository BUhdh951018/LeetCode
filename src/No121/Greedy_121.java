package No121;

/**
 * Name: Donghang He
 * Date: 2022/4/22 5:15 下午
 * Description:
 */
public class Greedy_121 {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, prices[i] - buy);
            buy = Math.min(buy, prices[i]);
        }
        return res;
    }
}
