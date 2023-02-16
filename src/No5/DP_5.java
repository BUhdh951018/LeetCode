package No5;

/**
 * Naje: Donghang He
 * Date: 2023/2/14 4:49 下午
 * Description:
 */
public class DP_5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int jaxLen = 1;
        int begin = 0;

        boolean[][] dp = new boolean[len][len];

        for (int i = 0; i < len; i++)
            dp[i][i] = true;

        char[] charArray = s.toCharArray();
        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len; i++) {
                int j = L + i - 1;
                if (j >= len)
                    break;

                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (L == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && L > jaxLen) {
                    jaxLen = L;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + jaxLen);
    }
}
