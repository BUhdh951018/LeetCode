package No647;

public class Dp_647 {
    public int countSubstrings(String s) {

        int ans = 0;
        boolean dp[][] = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j >= 0; j--) {
                if (s.charAt(j) == s.charAt(i) && ((i - j < 2) || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    ans++;
                }
            }
        }

        return ans;
    }
}
