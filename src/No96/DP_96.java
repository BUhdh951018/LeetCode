package No96;

/**
 * Name: Donghang He
 * Date: 2022/5/2 7:28 下午
 * Description:
 */
public class DP_96 {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                dp[i] += dp[j - 1] * dp[i - j];
        }

        return dp[n];
    }
}
