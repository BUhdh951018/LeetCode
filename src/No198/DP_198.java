package No198;

/**
 * Name: Donghang He
 * Date: 2022/3/24 5:52 下午
 * Description:
 */
public class DP_198 {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return nums[0];
        int dp_i_0 = nums[0], dp_i_1 = Math.max(nums[0], nums[1]);
        int res = Math.max(dp_i_1, dp_i_0);
        for (int i = 2; i < n; i++) {
            res = Math.max(dp_i_1, nums[i] + dp_i_0);
            dp_i_0 = dp_i_1;
            dp_i_1 = res;
        }

        return res;
    }
}
