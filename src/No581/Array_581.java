package No581;

/**
 * Name: Donghang He
 * Date: 2023/2/28 3:52 下午
 * Description:
 */
public class Array_581 {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int minN = Integer.MIN_VALUE, right = -1;
        int maxN = Integer.MAX_VALUE, left = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < minN)
                right = i;
            else
                minN = nums[i];
            if (nums[n - i - 1] > maxN)
                left = n - i - 1;
            else
                maxN = nums[n - i - 1];
        }

        return right == -1 ? 0 : right - left + 1;
    }
}
