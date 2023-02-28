package No494;

/**
 * Name: Donghang He
 * Date: 2023/2/27 12:28 下午
 * Description:
 */
public class Backtrack_494 {
    private int count = 0;
    public int findTargetSumWays(int[] nums, int target) {

        backtrack(nums, target, 0, 0);
        return count;
    }

    private void backtrack(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target)
                count++;
        } else {
            backtrack(nums, target, index + 1, sum + nums[index]);
            backtrack(nums, target, index + 1, sum - nums[index]);
        }

    }
}
