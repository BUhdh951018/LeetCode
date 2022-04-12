package No91;

/**
 * Name: Donghang He
 * Date: 2022/4/9 7:14 下午
 * Description:
 */
public class DP_91 {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            int first = Integer.parseInt(s.substring(i - 1, i));
            if (first != 0)
                dp[i] = dp[i - 1];

            if (s.charAt(i - 2) == '0')
                continue;
            int second = Integer.parseInt(s.substring(i - 2, i));
            if (second <= 26)
                dp[i] += dp[i - 2];

        }

        return dp[n];
    }
}
