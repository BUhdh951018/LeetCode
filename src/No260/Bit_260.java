package No260;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2022/4/13 8:34 下午
 * Description:
 */
public class Bit_260 {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for (int num : nums)
            x ^= num;
        x &= -x;

        int[] res = new int[2];
        for (int num : nums) {
            if ( (num & x) == 0)
                res[0] ^= num;
            else
                res[1] ^= num;
        }

        return res;
    }
}
