package exercise;

/**
 * Name: Donghang He
 * Date: 2022/4/14 5:14 下午
 * Description:
 */
public class backpack {
    public int knapsack1(int w, int n, int[] weights, int[] values) {
        int[][] dp = new int[n+1][w+1];
        for (int i = 1; i <= n; i++) {
            int w1 = weights[i - 1], v = values[i - 1];
            for (int j = 1; j <= w; j++) {
                if (j >= w1) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w1] + v);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][w];
    }

    public int knapsack(int W, int N, int[] weights, int[] values) {
        int[] dp = new int[W + 1];
        for (int i = 1; i <= N; i++) {
            int w = weights[i - 1], v = values[i - 1];
            for (int j = W; j >= 1; j--)
                if (j >= w)
                    dp[j] = Math.max(dp[j], dp[j - w] + v);
        }

        return dp[W];
    }
}
