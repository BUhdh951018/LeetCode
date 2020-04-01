package No53;

public class test_53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        solution_53 result = new solution_53();
        int ans = result.maxSubArray(nums);
        int ans1 = new solution_53_2().maxSunArray(nums);
        System.out.printf("%d %d", ans, ans1);
    }

}
