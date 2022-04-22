package No693;

/**
 * Name: Donghang He
 * Date: 2022/4/21 7:27 下午
 * Description:
 */
public class Bit_693 {
    public boolean hasAlternatingBits(int n) {
        n = n ^ (n >> 1);
        return (n & (n + 1)) == 0;

    }
}
