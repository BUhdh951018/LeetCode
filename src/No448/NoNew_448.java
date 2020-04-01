package No448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoNew_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.abs(nums[i]) - 1;

            if (nums[temp] > 0) {
                nums[temp] *= -1;
            }
        }

        for (int j = 1; j <= nums.length; j++) {
            if (nums[j - 1] > 0)
                ans.add(j);
        }

        return ans;
    }
}
