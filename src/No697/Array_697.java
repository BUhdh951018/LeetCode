package No697;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2022/12/14 11:14 上午
 * Description:
 */
public class Array_697 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{1, i, i});
            } else {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            }
        }

        int count = 0;
        int res = nums.length;
        for (int key : map.keySet()) {
            int[] num = map.get(key);
            if (num[0] > count) {
                count = num[0];
                res = num[2] - num[1] + 1;
            } else if (num[0] == count) {
                res = Math.min(res, num[2] - num[1] + 1);
            }
        }

        return res;
    }
}
