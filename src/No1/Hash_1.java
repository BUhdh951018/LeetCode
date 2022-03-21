package No1;

import java.util.HashMap;

/**
 * Name: Donghang He
 * Date: 2022/3/20 8:43 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Hash_1 {
    private HashMap<Integer, Integer> map = new HashMap<>();
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                if (map.get(target - nums[i]) != i)
                    return new int[]{map.get(target - nums[i]), i};
            }
        }
        return null;
    }
}
