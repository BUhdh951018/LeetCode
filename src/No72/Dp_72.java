package No72;

public class Dp_72 {
    public int minDistance(String string1, String string2) {
        int m = string1.length();
        int n = string2.length();

        if (m * n == 0) {
            return m + n;
        }

        int[][] dp = new int[m+1][n+1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i ++)
            for (int j = 1; j <= n; j++) {
                int left = dp[i - 1][j] + 1;
                int down = dp[i][j - 1] + 1;
                int left_down = dp[i - 1][j - 1];

                if (string1.charAt(i - 1) != string2.charAt(j - 1))
                    left_down++;

                dp[i][j] = Math.min(left_down, Math.min(left, down));
            }

        return dp[m][n];
    }
}
