package No198;

/**
 * Name: Donghang He
 * Date: 2022/3/24 5:52 下午
 * Description:
 */
public class DP_198 {
    public int rob(int[] nums) {
        if (nums.length < 2)
            return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
