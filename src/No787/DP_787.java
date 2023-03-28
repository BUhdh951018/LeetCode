package No787;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/3/27 6:23 下午
 * Description:
 */
public class DP_787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[][] dp = new int[k + 2][n];
        for (int i = 0; i < k + 2; i++)
            Arrays.fill(dp[i], 100000);
        dp[0][src] = 0;

        for (int i = 1; i <= k + 1; i++) {
            for (int[] flight: flights) {
                int start = flight[0], end = flight[1], price = flight[2];
                dp[i][end] = Math.min(dp[i][end], dp[i - 1][start] + price);
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 1; i < k + 2; i++) {
            res = Math.min(res, dp[i][dst]);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
