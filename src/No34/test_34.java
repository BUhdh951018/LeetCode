package No34;

public class test_34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans = new solution_34_1().searchRange(nums, target);
        System.out.printf("%d %d",ans[0], ans[1]);
    }
}
