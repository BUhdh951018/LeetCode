package No485;

/**
 * Name: Donghang He
 * Date: 2022/12/12 12:49 下午
 * Description:
 */
public class Array_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, count = 0;
        for (int num : nums) {
            if (num == 1)
                count++;
            else {
                res = Math.max(res, count);
                count = 0;
            }
        }
        res = Math.max(res, count);
        return res;
    }
}
