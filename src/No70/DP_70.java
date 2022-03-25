package No70;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/3/24 5:40 下午
 * Description:
 */
public class DP_70 {
    public int climbStairs(int n) {
        int[] r = new int[n];
        r[0] = 1;
        r[1] = 2;
        for (int i = 2; i < n; i++) {
            r[i] = r[i - 1] + r[i - 2];
        }
        System.out.println(Arrays.toString(r));
        return r[n - 1];
    }
}
