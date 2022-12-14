package No283;

/**
 * Name: Donghang He
 * Date: 2022/12/12 12:16 下午
 * Description:
 */
public class Array_283 {
    public void moveZeroes(int[] nums) {
        int temp = 0;
        for (int num : nums) {
            if (num != 0)
                nums[temp++] = num;
        }

        while (temp < nums.length)
            nums[temp++] = 0;
    }
}
