package No191;

/**
 * Name: Donghang He
 * Date: 2023/4/6 5:54 下午
 * Description:
 */
public class Bit_191 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            n &= n - 1;
            res++;
        }
        return res;
    }
}
