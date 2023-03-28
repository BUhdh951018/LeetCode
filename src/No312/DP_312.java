package No312;

/**
 * Name: Donghang He
 * Date: 2023/3/27 8:20 下午
 * Description:
 */
public class DP_312 {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] points = new int[n + 2];
        points[0] = 1;
        points[n + 1] = 1;
        for (int i = 1; i < n + 1; i++)
            points[i] = nums[i - 1];
        int[][] dp = new int[n + 2][n + 2];
        for (int i = n; i >= 0; i--) {
            for (int k = i + 1; k < n + 2; k++) {
                for (int l = i + 1; l < k; l++) {
                    dp[i][k] = Math.max(dp[i][k], dp[i][l] + dp[l][k] + points[i] * points[k] * points[l]);
                }
            }
        }
        return dp[0][n + 1];
    }
}
