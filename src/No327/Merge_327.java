package No327;

/**
 * Name: Donghang He
 * Date: 2023/3/17 5:24 下午
 * Description:
 */
public class Merge_327 {

    private int lower, upper;
    private int count;
    private long[] temp;
    public int countRangeSum(int[] nums, int lower, int upper) {
        int n = nums.length;
        temp = new long[n + 1];
        count = 0;
        this.lower = lower;
        this.upper = upper;
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++)
            pre[i + 1] = pre[i] + nums[i];
        sort(pre, 0, n);
        return count;
    }

    private void sort(long[] nums, int lo, int hi) {
        if (lo == hi)
            return;

        int mid = lo + (hi - lo) / 2;
        sort(nums, lo, mid);
        sort(nums, mid + 1, hi);

        merge(nums, lo, mid, hi);
    }

    private void merge(long[] nums, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++)
            temp[i] = nums[i];

        int start = mid + 1, end = mid + 1;
        for (int i = lo; i <= mid; i++) {
            while (start <= hi && nums[start] - nums[i] < lower)
                start++;
            while (end <= hi && nums[end] - nums[i] <= upper)
                end++;

            count += end - start;
        }

        int l = lo, r = mid + 1;
        for (int i = lo; i <= hi; i++) {
            if (l == mid + 1)
                nums[i] = temp[r++];
            else if (r == hi + 1)
                nums[i] = temp[l++];
            else if (temp[l] > temp[r])
                nums[i] = temp[r++];
            else
                nums[i] = temp[l++];
        }
    }
}
