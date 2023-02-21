package No75;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/3/23 6:53 下午
 * Description:
 */
public class Double_75 {
    public void sortColors(int[] nums) {
        int i = 0, zero = 0, two = nums.length;

        while (zero < two) {
            if (nums[zero] == 0){
                swap(nums, zero++, i++);
                continue;
            }
            if (nums[zero] == 2) {
                swap(nums, --two, zero);
            } else {
                zero++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
