package No338;

/**
 * Name: Donghang He
 * Date: 2022/4/21 8:10 下午
 * Description:
 */
public class Bit_338 {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0)
                temp = i;
            dp[i] = dp[i - temp] + 1;

        }

        return dp;
    }
}
