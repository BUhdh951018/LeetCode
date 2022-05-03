package No55;

/**
 * Name: Donghang He
 * Date: 2022/5/2 6:32 下午
 * Description:
 */
public class DP_55 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return true;
        boolean[] dp = new boolean[len];
        dp[0] = true;
        for (int i = 0; i < len; i++) {
            if (dp[i]) {
                for (int j = 1; j <= (i + nums[i]); j++) {
                    if (j == len - 1)
                        return true;
                    dp[j] = true;
                }
            }
        }

        return dp[len - 1];
    }
}
