package No78;

import java.util.ArrayList;
import java.util.List;

public class backtrack_78 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

        int len = nums.length;
        backtrack(0, new ArrayList<Integer>(), nums);
        return ans;
    }

    private void backtrack(int j, ArrayList<Integer> temp, int[] nums) {
        ans.add(new ArrayList<Integer>(temp));

        for (int i = j; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i + 1, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
