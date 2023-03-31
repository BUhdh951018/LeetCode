package No1641;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/3/29 4:46 下午
 * Description:
 */
public class DP_1641 {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n][5];
        Arrays.fill(dp[0], 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                int temp = 0;
                for (int l = j; l < 5; l++) {
                    temp += dp[i - 1][l];
                }
                dp[i][j] = temp;
            }
        }
        int res = 0;
        for (int i = 0; i < 5; i++)
            res += dp[n - 1][i];
        return res;
    }
}
