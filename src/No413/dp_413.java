package No413;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/3/25 5:03 下午
 * Description:
 */
public class dp_413 {
    public int numberOfArithmeticsSlices(int[] nums) {
        if (nums.length < 2)
            return 0;
        int[] dp = new int[nums.length];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2])
                dp[i] = dp[i - 1] + 1;
        }
        int ans = 0;
        for (int temp : dp) {
            ans += temp;
        }
        return ans;
    }
}
