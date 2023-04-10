package No372;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/4/9 5:12 下午
 * Description:
 */
public class Math_372 {
    public int superPow(int a, int[] b) {

        if (b.length == 0)
            return 1;
        int last = b[b.length - 1];
        int[] newB = new int[b.length - 1];
        System.arraycopy(b, 0, newB, 0, b.length - 1);

        int part1 = myPow(a, last);
        int part2 = myPow(superPow(a, newB), 10);

        return (part1 * part2) % 1337;
    }

    private int myPow(int a, int k) {
        if (k == 0)
            return 1;

        a %= 1337;
        if (k % 2 == 1) {
            return (a * myPow(a, k - 1)) % 1337;
        } else {
            int sub = myPow(a, k / 2);
            return (sub * sub) % 1337;
        }
    }
}
