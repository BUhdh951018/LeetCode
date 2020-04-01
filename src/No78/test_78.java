package No78;

import java.util.List;

public class test_78 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new backtrack_78().subsets(nums);
        System.out.println(ans);
    }
}
