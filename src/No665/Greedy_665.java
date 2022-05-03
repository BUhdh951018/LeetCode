package No665;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/24 5:13 下午
 * Description:
 */
public class Greedy_665 {
    public boolean checkPossibility(int[] nums) {
        int flag = 0;
        for (int i = 0 ; i < nums.length - 1; i++) {
            int x = nums[i], y = nums[i + 1];
            if (x > y) {
                flag++;
                if (flag > 1)
                    return false;

                if (i > 0 && y < nums[i - 1])
                    nums[i + 1] = x;
            }
        }
        return true;
    }
}
