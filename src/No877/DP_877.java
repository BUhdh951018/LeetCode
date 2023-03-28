package No877;

/**
 * Name: Donghang He
 * Date: 2023/3/27 9:40 下午
 * Description:
 */
public class DP_877 {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++)
            dp[i] = piles[i];

        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                dp[i] = Math.max(piles[i] - dp[j], piles[i] - dp[j - 1]);
            }
        }
        return dp[n - 1] > 0;
    }
}
