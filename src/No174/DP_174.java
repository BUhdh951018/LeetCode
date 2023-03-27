package No174;

/**
 * Name: Donghang He
 * Date: 2023/3/27 12:08 上午
 * Description:
 */
public class DP_174 {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = -dungeon[m - 1][n - 1] + 1;
        if (dp[m - 1][n - 1] <= 0)
            dp[m - 1][n - 1] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >=0; j--) {
                int temp = 0;
                temp = -dungeon[i][j];
                if (i == m - 1 && j == n - 1)
                    continue;
                if (i == m - 1) {
                    temp += dp[m - 1][j + 1];
                    dp[m - 1][j] = temp <= 0 ? 1 : temp;
                    continue;
                }
                if (j == n - 1) {
                    temp += dp[i + 1][n - 1];
                    dp[i][n - 1] = temp <= 0 ? 1 : temp;
                    continue;
                }
                temp += Math.min(dp[i][j + 1], dp[i + 1][j]);
                dp[i][j] = temp <= 0 ? 1 : temp;
            }
        }

        return dp[0][0];
    }
}
