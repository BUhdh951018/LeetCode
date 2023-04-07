package No231;

/**
 * Name: Donghang He
 * Date: 2022/4/21 7:13 下午
 * Description:
 */
public class Bit_231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
