package No300;

public class test_300 {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums1 = {4, 10, 4, 3, 8, 9};
        System.out.println(new Dp_300().lengthOfLIS(nums));
        System.out.println(new Dichotomy_300().lengthOfLIS(nums));

    }
}
