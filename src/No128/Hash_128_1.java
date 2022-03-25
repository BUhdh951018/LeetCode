package No128;

import java.util.HashSet;
import java.util.Set;

/**
 * Name: Donghang He
 * Date: 2022/3/22 4:26 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Hash_128_1 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int ans = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentAns = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentAns++;
                }

                ans = Math.max(ans, currentAns);
            }
        }

        return ans;
    }
}
