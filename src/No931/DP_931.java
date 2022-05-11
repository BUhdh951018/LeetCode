package No931;

/**
 * Name: Donghang He
 * Date: 2022/5/4 6:30 下午
 * Description:
 */
public class DP_931 {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        System.arraycopy(matrix[0], 0, dp[0], 0, n);

        for (int i = 1; i < m; i++) {
            dp[i][0] = Math.min(dp[i - 1][0], dp[i - 1][1]) + matrix[i][0];
            for (int j = 1; j < n - 1; j++) {
                dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]) +
                        matrix[i][j];
            }
            dp[i][n - 1] = Math.min(dp[i - 1][n - 1], dp[i - 1][n - 2]) + matrix[i][n - 1];
        }

        int res = Integer.MAX_VALUE;
        for (int num : dp[m - 1]) {
            res = Math.min(num, res);
        }

        return res;
    }
}
