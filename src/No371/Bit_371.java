package No371;

/**
 * Name: Donghang He
 * Date: 2022/4/21 7:45 下午
 * Description:
 */
public class Bit_371 {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum((a ^ b), (a & b) << 1);
    }
}
