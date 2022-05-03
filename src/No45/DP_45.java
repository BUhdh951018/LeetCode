package No45;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/5/2 7:41 下午
 * Description:
 */
public class DP_45 {
    public int jump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[len - 1] = 0;

        for (int i = len - 2; i >= 0; i--) {
            int temp;
            if (nums[i] > 0) {
                temp = Integer.MAX_VALUE;
                for (int j = i + 1; j <= i + nums[i] && j < len; j++) {
                    temp = Math.min(temp, dp[j]);
                }
                if (temp == Integer.MAX_VALUE)
                    dp[i] = temp;
                else
                    dp[i] = temp + 1;
            } else {
                dp[i] = Integer.MAX_VALUE;
            }
        }
        return dp[0];
    }
}
