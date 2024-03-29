package No62;

/**
 * Name: Donghang He
 * Date: 2022/3/25 4:27 下午
 * Description:
 */
public class DP_62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0 || j == 0) {
                    dp[i][j] = (i == 0) ? dp[i][j - 1] : dp[i - 1][j];
                    continue;
                }

                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }

        return dp[m - 1][n - 1];
    }
}
