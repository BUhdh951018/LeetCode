package No343;

/**
 * Name: Donghang He
 * Date: 2022/3/25 5:19 下午
 * Description:
 */
public class DP_343 {
    public int integerBreak(int n) {
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            int temp = 0;
            for (int j = 1; j < i; j++)
                temp = Math.max(temp, Math.max(j * (i - j), j * dp[i - j]));
            dp[i] = temp;
        }

        return dp[n - 1];
    }
}
