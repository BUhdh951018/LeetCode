package No740;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/5/2 5:43 下午
 * Description:
 */
public class DP_740 {
    public int deleteAndEarn(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        if (len < 2) {
            return nums[nums.length - 1];
        }
        int[] newNums = new int[nums[len - 1] + 1];
        for (int num : nums)
            newNums[num]++;

        for (int i = 0; i < newNums.length; i++)
            newNums[i] = i * newNums[i];
        int[] dp = new int[newNums.length];
        dp[0] = 0;
        dp[1] = newNums[1];
        dp[2] = Math.max(newNums[1], newNums[2]);
        for (int i = 3; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 1], newNums[i] + dp[i - 2]);
        }

        Arrays.sort(dp);
        System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }
}
