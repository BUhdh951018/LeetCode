package No633;

/**
 * Name: Donghang He
 * Date: 2022/5/31 4:10 下午
 * Description:
 */
public class DoublePoint_633 {
    public boolean judgeSquareSum(int c) {
        long first = 0;
        long second = (long) Math.sqrt(c);
        while (first <= second) {
            long temp = first * first + second * second;
            if (temp == c)
                return true;
            else if (temp < c)
                first++;
            else
                second--;
        }

        return false;
    }
}
