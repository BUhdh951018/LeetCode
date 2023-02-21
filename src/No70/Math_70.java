package No70;

public class Math_70 {
    public int climbStairs(int n) {
        double gen = Math.sqrt(5);
        double fib = Math.pow((1 + gen) / 2, n + 1) - Math.pow((1 - gen) / 2, n + 1);
        return (int) (fib/gen);
    }

}
