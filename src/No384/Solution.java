package No384;

import java.util.Arrays;
import java.util.Random;

/**
 * Name: Donghang He
 * Date: 2023/4/6 5:13 下午
 * Description:
 */
public class Solution {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        Random random = new Random();
        int n = nums.length;
        int[] res = Arrays.copyOf(nums, n);
        for (int i = 0; i < n; i++) {
            int r = random.nextInt(n - i) + i;
            swap(res, i, r);
        }
        return res;
    }
    private void swap(int[] temp, int i,int j) {
        int cur = temp[i];
        temp[i] = temp[j];
        temp[j] = cur;
    }
}
