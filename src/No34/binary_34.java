package No34;

public class binary_34 {
    public int[] searchRange(int[] nums, int target) {
        int left = search(nums, target, true);
        int right = search(nums, target, false);
        if (left != right)
            right--;
        if (left <= right && right < nums.length && nums[left] == target && nums[right] == target)
            return new int[]{left, right};

        return new int[]{-1, -1};
    }

    private int search(int[] nums, int target, boolean left) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && nums[mid] == target)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}
