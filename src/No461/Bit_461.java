package No461;

/**
 * Name: Donghang He
 * Date: 2022/4/9 7:56 下午
 * Description:
 */
public class Bit_461 {
    public int hammingDistance(int x, int y) {
        int ans = x ^ y;
        int count = 0;
        while (ans != 0) {
            if ((ans & 1) == 1)
                count++;
            ans = ans >> 1;
        }
        return count;
    }
}
