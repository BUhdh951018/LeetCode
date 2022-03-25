package No75;

/**
 * Name: Donghang He
 * Date: 2022/3/23 6:53 下午
 * Description:
 */
public class TwoPoint {
    public void sortColors(int[] nums) {
        int zero = -1, one = 0, two = nums.length;
        while (one < two) {
            if (nums[one] == 0)
                swap(nums, ++zero, one++);
            if (nums[one] == 2) {
                swap(nums, two--, one);
            } else {
                one++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
