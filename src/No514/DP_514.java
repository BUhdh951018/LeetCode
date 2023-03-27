package No514;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/27 12:31 上午
 * Description:
 */
public class DP_514 {
    public int findRotateSteps(String ring, String key) {
        int m = ring.length(), n = key.length();
        int[][] dp = new int[n][m];
        Map<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            if (!map.containsKey(ring.charAt(i)))
                map.put(ring.charAt(i), new ArrayList<>());
            map.get(ring.charAt(i)).add(i);
        }

        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            for (int k : map.get(key.charAt(i))) {
                if (i == 0) {
                    dp[i][k] = Math.min(k, m - k) + 1;
                    continue;
                }
                for (int l : map.get(key.charAt(i - 1))) {
                    dp[i][k] = Math.min(dp[i][k], dp[i - 1][l] + Math.min(Math.abs(k - l), m - Math.abs(k - l)) + 1);
                }
            }
        }
        Arrays.sort(dp[n - 1]);
        return dp[n - 1][0];
    }
}
