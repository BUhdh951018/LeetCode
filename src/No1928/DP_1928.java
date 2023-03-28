package No1928;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/3/27 6:53 下午
 * Description:
 */
public class DP_1928 {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int n = passingFees.length;
        int[][] dp = new int[maxTime + 1][n];
        for (int i = 0; i <= maxTime; i++)
            Arrays.fill(dp[i], 10000000);
        dp[0][0] = passingFees[0];
        for (int i = 1; i <= maxTime; i++) {
            for (int[] edge : edges) {
                int first = edge[0], second = edge[1], time = edge[2];
                if (time <= i) {
                    dp[i][first] = Math.min(dp[i][first], dp[i - time][second] + passingFees[first]);
                    dp[i][second] = Math.min(dp[i][second], dp[i - time][first] + passingFees[second]);
                }
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= maxTime; i++)
            res = Math.min(res, dp[i][n - 1]);
        return res == 10000000 ? -1 : res;
    }
}
