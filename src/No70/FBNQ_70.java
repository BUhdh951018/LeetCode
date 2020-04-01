package No70;

public class FBNQ_70 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;
        int second = 2;
        for(int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public int climb(int n) {
        double gen = Math.sqrt(5);
        double fib = Math.pow((1 + gen) / 2, n + 1) - Math.pow((1 - gen) / 2, n + 1);
        return (int) (fib/gen);
    }
}
