package No152;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/5/10 7:21 下午
 * Description:
 */
public class DP_152 {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] dpMin = new int[len];
        int[] dpMax = new int[len];
        dpMin[0] = nums[0];
        dpMax[0] = nums[0];
        int res = dpMax[0];

        for (int i = 1; i < len; i++) {
            dpMax[i] = Math.max(dpMax[i - 1] * nums[i], Math.max(dpMin[i - 1] * nums[i], nums[i]));
            dpMin[i] = Math.min(dpMin[i - 1] * nums[i], Math.min(dpMax[i - 1] * nums[i], nums[i]));
            res = Math.max(res, dpMax[i]);
        }


        return res;
    }
}
