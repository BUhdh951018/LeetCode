package No581;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/2/28 3:46 下午
 * Description:
 */
public class Sort_581 {
    public int findUnsortedSubarray(int[] nums) {

        int[] numsSorted = new int[nums.length];
        numsSorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsSorted);
        int left = 0;

        while (nums[left] == numsSorted[left]) {
            left++;
            if (left == nums.length)
                return 0;
        }

        int right = nums.length - 1;
        while (nums[right] == numsSorted[right])
            right--;

        return right - left + 1;
    }
}
