package No169;

import java.util.HashMap;
import java.util.Map;

public class HashMap_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int max = 0;
        int ans = 0;
        for (int num: nums) {
            int temp = map.get(num);
            int temp_max = max;
            max = Math.max(max, temp);
            if (temp_max != max) {
                ans = num;
            }

        }

        return ans;
    }
}
