package No667;

/**
 * Name: Donghang He
 * Date: 2022/12/13 12:07 下午
 * Description:
 */
public class Array_667 {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 1, interval = k; i <= k; i++, interval--)
            res[i] = i % 2 == 1 ? res[i - 1] + interval : res[i - 1] - interval;

        for (int i = k + 1; i < n; i++) {
            res[i] = i + 1;
        }

        return res;
    }
}
