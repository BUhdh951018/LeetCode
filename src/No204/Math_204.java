package No204;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/4/6 6:58 下午
 * Description:
 */
public class Math_204 {
    public int countPrimes(int n) {
        boolean[] count = new boolean[n];
        Arrays.fill(count, true);

        for (int i = 2; i < n; i++) {
            if (count[i]) {
                for (int j = i * i; j < n; j += i) {
                    count[j] = false;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++)
            if (count[i])
                res++;
        return res;    
    }
}
