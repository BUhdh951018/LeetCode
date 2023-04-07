package No268;

/**
 * Name: Donghang He
 * Date: 2022/4/9 8:16 下午
 * Description:
 */
public class Bit_268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = n;
        for (int i = 0; i < n; i++)
            res ^= i ^ nums[i];
        return res;
    }
}
