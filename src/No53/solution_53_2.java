package No53;

public class solution_53_2 {
    public int maxSunArray(int[] nums) {
        int n = nums.length, maxSum = nums[0];
        for(int i = 1; i < n; i++) {
            if (nums[i - 1] > 0)
                nums[i] += nums[i - 1];
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }
}
