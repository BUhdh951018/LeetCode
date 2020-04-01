package No70;

public class test_70 {
    public static void main(String[] args) {
        int n = 30;
        int solution_1 = new FBNQ_70().climbStairs(n);
        int solution_2 = new FBNQ_70().climb(n);

        System.out.println(solution_1);
        System.out.println(solution_2);
    }
}
