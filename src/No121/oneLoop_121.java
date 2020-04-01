package No121;

public class oneLoop_121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
