package No34;

public class binary_34 {
    public int[] searchRange(int[] nums, int target) {
        int leftSearch = leftSearch(nums, target);
        int rightSearch = rightSearch(nums, target);

        return new int[]{leftSearch, rightSearch};
    }

    private int leftSearch(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                right = mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid;
        }

        if (left == nums.length)
            return -1;

        return nums[left] == target ? left : -1;
    }

    private int rightSearch(int[] nums, int target) {
        int left = 0, right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                left = mid + 1;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid;
        }
        if (right - 1 < 0)
            return -1;

        return nums[right - 1] == target ? right - 1 : -1;
    }
}
