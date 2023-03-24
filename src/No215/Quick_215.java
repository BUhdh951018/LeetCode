package No215;

import java.util.Random;

/**
 * Name: Donghang He
 * Date: 2023/3/21 2:38 下午
 * Description:
 */
public class Quick_215 {
    public int findKthLargest(int[] nums, int k) {
        shuffle(nums);
        int lo = 0, hi = nums.length - 1;
        k = nums.length - k;
        while (lo <= hi) {
            int p = partition(nums, lo, hi);
            if (p < k)
                lo = p + 1;
            else if (p > k)
                hi = p - 1;
            else
                return nums[p];
        }
        return -1;
    }

    private int partition(int[] nums, int lo, int hi) {
        int pivot = nums[lo];

        int i = lo + 1, j = hi;
        while (i <= j) {
            while (i < lo && nums[i] <= pivot)
                i++;
            while (j > lo && nums[j] > pivot)
                j--;
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;
    }

    private void shuffle(int[] nums) {
        Random random = new Random();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int r = i + random.nextInt(n - i);
            swap(nums, i, r);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
