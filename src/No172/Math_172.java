package No172;

/**
 * Name: Donghang He
 * Date: 2023/4/6 6:19 下午
 * Description:
 */
public class Math_172 {
    public int trailingZeroes(int n) {
        int res = 0;
        long divisor = 5;
        while (divisor <= n) {
            res += n / divisor;
            divisor *= 5;
        }
        return res;
    }
}
