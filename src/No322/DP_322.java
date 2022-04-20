package No322;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/14 7:33 下午
 * Description:
 */
public class DP_322 {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0 || coins.length == 0)
            return 0;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int coin : coins)
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }

        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
