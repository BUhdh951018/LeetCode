package No698;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2023/4/5 4:11 下午
 * Description:
 */
public class Backtrack_698 {
    private final Map<Integer, Boolean> map = new HashMap<>();
    private int used;
    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;
        for (int num : nums)
            sum += num;
        if (sum % k != 0)
            return false;
        int target = sum / k;
        used = 0;
        return backtrack(nums, k, 0, target, 0);
    }

    private boolean backtrack(int[] nums, int k, int start, int target, int bucket) {
        if (k == 0) {
            return true;
        }
        if (bucket == target) {
            boolean res =  backtrack(nums, k - 1, 0, target, 0);
            map.put(used, res);
            return res;
        }
        if (map.containsKey(used))
            return map.get(used);
        for (int i = start; i < nums.length; i++) {
            if ((used >> i & 1) == 1)
                continue;
            if (nums[i] + bucket > target)
                continue;
            used |= 1 << i;
            bucket += nums[i];
            if (backtrack(nums, k, i, target, bucket))
                return true;
            bucket -= nums[i];
            used ^= 1 << i;
        }
        return false;
    }
}
