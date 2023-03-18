package No493;

/**
 * Name: Donghang He
 * Date: 2023/3/17 5:03 下午
 * Description:
 */
public class Merge_493 {

    private int[] temp;
    private int count;

    public int reversePairs(int[] nums) {
        int n = nums.length;
        temp = new int[n];
        count = 0;
        sort(nums, 0, n - 1);
        return count;
    }

    private void sort(int[] nums, int lo, int hi) {
        if (lo == hi)
            return;
        int mid = lo + (hi - lo) / 2;

        sort(nums, lo, mid);
        sort(nums, mid + 1, hi);

        merge(nums, lo, mid, hi);
    }

    private void merge(int[] nums, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++)
            temp[i] = nums[i];

        int cur = mid + 1;
        for (int i = lo; i <= mid; i++) {
            while (cur <= hi && (long)nums[i] > 2 * (long)nums[cur]){
                cur++;
            }
            count += cur - mid - 1;
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
