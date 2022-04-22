package No455;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2022/4/22 2:45 下午
 * Description:
 */
public class Greedy_455 {
    public int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int temp = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = temp; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    res++;
                    temp = j + 1;
                    break;
                }


            }
        }

        return res;
    }
}
