package No518;

/**
 * Name: Donghang He
 * Date: 2022/4/20 4:20 下午
 * Description:
 */
public class DP_518 {
    public int change(int amount, int[] coins) {

        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins)
            for (int i = coin; i <= amount; i++)
                dp[i] += dp[i - coin];
        return dp[amount];
    }
}
