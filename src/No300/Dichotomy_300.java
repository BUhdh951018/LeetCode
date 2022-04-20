package No300;

import java.util.Arrays;

public class Dichotomy_300 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];

        int ans = 0;

        for (int num : nums) {
            int dp_point = 0, num_point = ans;
            while (dp_point < num_point) {
                int m = (dp_point + num_point) / 2;
                if (dp[m] < num)
                    dp_point = m + 1;
                else
                    num_point = m;
            }

            dp[dp_point] = num;
            if (ans == num_point)
                ans++;
            //System.out.println(Arrays.toString(dp));
        }

        return ans;
    }
}
