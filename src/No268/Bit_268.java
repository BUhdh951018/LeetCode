package No268;

/**
 * Name: Donghang He
 * Date: 2022/4/9 8:16 下午
 * Description:
 */
public class Bit_268 {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }

        for (int i = 0; i <= nums.length; i++)
            ans ^= i;
        return ans;
    }
}
