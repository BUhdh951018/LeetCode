package No376;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/13 6:50 下午
 * Description:
 */
public class DP_376 {
    public int wiggleMaxLength(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int flag = 3;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            if (nums[i] > nums[i - 1]) {
                flag = 1;
            }

            else {
                flag = 0;
            }
            break;

        }
        if (flag == 3)
            return 1;
        int temp;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dp[i] = dp[i - 1];
                continue;
            }

            if (nums[i] > nums[i - 1])
                temp = 0;
            else
                temp = 1;
            if (temp != flag) {
                dp[i] = dp[i - 1] + 1;
                flag = temp;
            } else {
                dp[i] = dp[i - 1];
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[nums.length - 1];
    }
}
