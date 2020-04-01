package No221;

public class Dynamic_221 {
    public int maximalSquare(char[][] matrix) {
        int cols = matrix.length;

        int rows = cols > 0 ? matrix[0].length : 0;

        int ans = 0;
        int[][] dp = new int[cols + 1][rows + 1];

        for (int i = 1; i <= cols; i++) {
            for (int j = 1; j <= rows; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }

        return ans * ans;
    }
}
