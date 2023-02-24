package No238;

/**
 * Name: Donghang He
 * Date: 2023/2/23 5:34 下午
 * Description:
 */
public class Array_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int r = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * r;
            r *= nums[i];
        }

        return ans;
    }
}
