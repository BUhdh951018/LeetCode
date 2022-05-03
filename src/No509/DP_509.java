package No509;

/**
 * Name: Donghang He
 * Date: 2022/4/24 6:14 下午
 * Description:
 */
public class DP_509 {
    public int fib(int n) {
        if (n == 0)
            return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
