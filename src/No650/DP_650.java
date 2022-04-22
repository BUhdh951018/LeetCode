package No650;

/**
 * Name: Donghang He
 * Date: 2022/4/21 6:41 下午
 * Description:
 */
public class DP_650 {
    public int minSteps(int n) {
        if (n == 1)
            return 0;
        int[] dp = new int[n + 1];
        dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++)
                if (i % j == 0) {
                    dp[i] = dp[j] + dp[i / j];
                }
        }
        return dp[n];
    }
}
