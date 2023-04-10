package No645;

/**
 * Name: Donghang He
 * Date: 2023/4/9 5:35 下午
 * Description:
 */
public class Math_645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int dup = -1;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                dup = index + 1;
            } else {
                nums[index] *= -1;
            }
        }
        int missing = -1;
        for (int i = 0; i < n; i++)
            if (nums[i] > 0)
                missing = i + 1;

        return new int[]{dup, missing};
    }
}
