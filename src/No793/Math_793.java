package No793;

/**
 * Name: Donghang He
 * Date: 2023/4/6 6:32 下午
 * Description:
 */
public class Math_793 {
    public int preimageSizeFZF(int k) {
        return (int) (rightBound(k) - leftBound(k)) + 1;
    }

    private long leftBound(int k) {
        long lo = 0, hi = Long.MAX_VALUE;
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (trailingZeroes(mid) < k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    private long rightBound(int k) {
        long lo = 0, hi = Long.MAX_VALUE;
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (trailingZeroes(mid) < k) {
                lo = mid + 1;
            } else if (trailingZeroes(mid) > k){
                hi = mid;
            } else
                lo = mid + 1;
        }
        return lo - 1;
    }

    private long trailingZeroes(long n) {
        long res = 0;
        long divisor = 5;
        while (divisor <= n) {
            res += n / divisor;
            divisor *= 5;
        }
        return res;
    }
}
