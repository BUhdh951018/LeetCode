package No72;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/3/24 7:32 下午
 * Description:
 */
public class DP_72_1 {
    private int[][] memo;
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        memo = new int[m][n];
        for (int[] m1 : memo)
            Arrays.fill(m1, -1);
        return dp(word1, m - 1, word2, n - 1);
    }

    private int dp(String s1, int i, String s2, int j) {
        if (i == -1)
            return j + 1;
        if (j == -1)
            return i + 1;
        if (memo[i][j] != -1)
            return memo[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            memo[i][j] = dp(s1, i - 1, s2, j - 1);
        } else {
            memo[i][j] = 1 + Math.min(Math.min(dp(s1, i, s2, j - 1), dp(s1, i - 1, s2, j)), dp(s1, i - 1, s2, j - 1));
        }
        return memo[i][j];
    }
}
