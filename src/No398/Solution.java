package No398;

import java.util.Random;

/**
 * Name: Donghang He
 * Date: 2023/4/6 5:30 下午
 * Description:
 */
public class Solution {
    private final int[] nums;
    Random random;
    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int pick(int target) {
        int n = nums.length;
        int res = 0;

        for (int i = 0, count = 0; i < n; i++) {
            if (nums[i] == target) {
                count++;
                if (0 == random.nextInt(count)) {
                    res = i;
                }
            }
        }
        return res;

//        int n = nums.length;
//        while (true) {
//            int i = random.nextInt(n);
//            if (nums[i] == target)
//                return i;
//        }
    }
}
