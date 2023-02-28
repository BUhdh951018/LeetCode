package No560;

/**
 * Name: Donghang He
 * Date: 2023/2/27 1:17 下午
 * Description:
 */
public class enum_560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end >= 0; end--){
                sum += nums[end];
                if (sum == k)
                    count++;
            }
        }


        return count;
    }
}
