package No303;

/**
 * Name: Donghang He
 * Date: 2022/3/25 4:43 下午
 * Description:
 */
public class DP_303 {

    private final int[] sums;

    public DP_303(int[] nums) {
        sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i <nums.length; i++)
            sums[i] = sums[i - 1] + nums[i];
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return sums[right];
        return sums[right] - sums[left - 1];
    }
}
