package No565;

/**
 * Name: Donghang He
 * Date: 2022/12/14 1:34 下午
 * Description:
 */
public class Array_565 {
    public int arrayNesting(int[] nums) {
        int res = 0;
        for (int i = 0 ; i < nums.length; i++) {
            int temp = 0;
            for (int j = i; nums[j] != -1;) {
                temp++;
                int m = nums[j];
                nums[j] = -1;
                j = m;
            }

            res = Math.max(res, temp);
        }

        return res;
    }
}
