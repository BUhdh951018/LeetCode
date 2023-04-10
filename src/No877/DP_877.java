package No877;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/3/27 9:40 下午
 * Description:
 */
public class DP_877 {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[] dp = new int[n];
        dp = Arrays.copyOf(piles, n);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i] = Math.max(dp[i] - piles[j - 1], dp[j] - piles[i]);
            }
        }
        return dp[n - 1] > 0;
    }
}
