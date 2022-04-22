package No342;

/**
 * Name: Donghang He
 * Date: 2022/4/21 7:20 下午
 * Description:
 */
public class Bit_342 {
    public boolean isPowerOfFour(int n) {
        String temp = Integer.toBinaryString(n);
        return n > 0 && Integer.bitCount(n) == 1 && temp.length() % 2 != 0;
    }
}
