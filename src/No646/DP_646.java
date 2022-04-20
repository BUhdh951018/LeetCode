package No646;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Name: Donghang He
 * Date: 2022/4/13 6:34 下午
 * Description:
 */
public class DP_646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        int[] dp = new int[pairs.length];
        dp[0] = 1;

        for (int i = 1; i < pairs.length; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if (pairs[i][0] > pairs[j][1])
                    temp = Math.max(temp, dp[j]);
            }
            dp[i] = temp + 1;
        }

        int res = 0;
        for (int num : dp) {
            res = Math.max(res, num);
        }

        return res;
    }
}
