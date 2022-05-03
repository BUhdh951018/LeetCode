package No53;

/**
 * Name: Donghang He
 * Date: 2022/5/2 7:09 下午
 * Description:
 */
public class DP_53 {
    public int maxSubArray(int[] nums) {
        int temp = 0, max = nums[0];
        for (int num : nums) {
            temp = Math.max(temp + num, num);
            max = Math.max(temp, max);
        }
        return max;
    }
}
