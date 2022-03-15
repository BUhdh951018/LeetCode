package No347;

/**
 * Name: Donghang He
 * Date: 2022/3/13 6:57 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Counting_347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] b = new int[k];
        int[] c = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            c[i] = 0;
        }

        for (int j = 1; j <= nums.length; j++) {
            c[nums[j]] = c[nums[j]] + 1;
        }

        for (int i = 0; i < c.length; i++) {

        }
        return b;
    }
}
