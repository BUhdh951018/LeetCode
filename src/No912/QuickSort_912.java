package No912;

import java.util.Random;

public class QuickSort_912 {
    public int[] sortArray(int[] nums) {
        randomized_quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private void randomized_quicksort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int lo = left + 1;
        int hi = right;

        while (lo <= hi) {
            if (nums[lo] > nums[left]) {
                swap(nums, lo, hi);
                hi--;
            } else {
                lo++;
            }
        }

        lo--;
        swap(nums, left, lo);
        randomized_quicksort(nums, left, lo - 1);
        randomized_quicksort(nums, lo + 1, right);

    }

    private void swap(int[] nums, int lo, int hi) {
        int temp = nums[lo];
        nums[lo] = nums[hi];
        nums[hi] = temp;
    }
}
