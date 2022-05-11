package No27;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/5/3 6:02 下午
 * Description:
 */
public class TwoPoint_27 {
    public int removeElement(int[] nums, int val) {
        int first = 0;
        int second = 0;
        while (second < nums.length) {
            if (nums[second] == val) {
                second++;
                continue;
            }
            nums[first++] = nums[second];
            second++;
        }
        System.out.println(Arrays.toString(nums));
        return first;
    }
}
