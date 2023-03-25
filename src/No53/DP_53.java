package No53;

/**
 * Name: Donghang He
 * Date: 2022/5/2 7:09 下午
 * Description:
 */
public class DP_53 {
    public int maxSubArray(int[] nums) {
        int left = 0, right = 0;
        int window = 0;
        int res = Integer.MIN_VALUE;
        while (right < nums.length) {
            window += nums[right++];

            res = Math.max(res, window);

            while (window < 0) {
                window -= nums[left++];
            }
        }
        return res;
    }
}
