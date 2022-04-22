package No122;

/**
 * Name: Donghang He
 * Date: 2022/4/22 5:26 下午
 * Description:
 */

public class Greedy_122 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                res += (prices[i] - prices[i - 1]);
        }

        return res;
    }
}
