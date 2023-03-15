package No304;

/**
 * Name: Donghang He
 * Date: 2023/3/14 6:28 下午
 * Description:
 */
public class DP_304 {
    private final int[][] dp;
    public DP_304(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = matrix[i][j];
                    continue;
                }
                if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + matrix[i][j];
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + matrix[i][j];
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] + matrix[i][j] - dp[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (row1 == 0 && col1 != 0)
            return dp[row2][col2] - dp[row2][col1 - 1];
        else if (row1 != 0 && col1 == 0)
            return dp[row2][col2] - dp[row1 - 1][col2];
        else if (row1 == 0)
            return dp[row2][col2];
        return dp[row2][col2] - dp[row2][col1 - 1] - dp[row1 - 1][col2] + dp[row1 - 1][col1 - 1];
    }
}
