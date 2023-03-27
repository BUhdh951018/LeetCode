package No712;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/3/25 6:03 下午
 * Description:
 */
public class DP_712 {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0) {
                    dp[0][j] += dp[0][j - 1] + s2.charAt(j - 1);
                    continue;
                }
                if (j == 0) {
                    dp[i][0] += dp[i - 1][0] + s1.charAt(i - 1);
                    continue;
                }
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));

            }
        }
        return dp[m][n];
    }
}
