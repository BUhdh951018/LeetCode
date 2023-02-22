package No128;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2022/3/20 9:10 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Hash_128 {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }

        for (int num : nums) {
            forward(map, num);
        }

        return maxCount(map);
    }

    private int forward(Map<Integer, Integer> map, int num) {
        if (!map.containsKey(num)) {
            return 0;
        }

        int count = map.get(num);
        if (count > 1)
            return count;
        count = forward(map, num + 1) + 1;
        map.put(num, count);
        return count;
    }

    private int maxCount(Map<Integer, Integer> map) {
        int max = 0;
        for (int num : map.keySet()) {
            max = Math.max(max, map.get(num));
        }

        return max;
    }
}
