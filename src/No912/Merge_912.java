package No912;

/**
 * Name: Donghang He
 * Date: 2023/3/17 4:21 下午
 * Description:
 */
public class Merge_912 {

    private int[] merge;

    public int[] sortArray(int[] nums) {
        merge = new int[nums.length];
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private void sort(int[] nums, int left, int right) {
        if (left == right)
            return;

        int mid = left + (right - left) / 2;
        sort(nums, left, mid);
        sort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left ,int mid, int right) {
        for (int i = left; i <= right; i++)
            merge[i] = nums[i];

        int lo = left, hi = mid + 1;
        for (int i = left; i <= right; i++) {
            if (lo == mid + 1)
                nums[i] = merge[hi++];
            else if (hi == right + 1)
                nums[i] = merge[lo++];
            else if (merge[lo] < merge[hi])
                nums[i] = merge[lo++];
            else
                nums[i] = merge[hi++];
        }
    }
}
