package No1014;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/5/4 6:50 下午
 * Description:
 */
public class DP_1014 {
    public int maxScoreSightseeingPair(int[] values) {
        int len = values.length;
        int dp = 0, res = values[0];
        for (int i = 1; i < len; i++) {
            dp = Math.max(dp, res + values[i] - i);
            res = Math.max(res, values[i] + i);
        }
        return res;
    }
}
