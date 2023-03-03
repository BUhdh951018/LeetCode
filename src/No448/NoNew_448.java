package No448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoNew_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int num : nums) {
            int temp = (num - 1) % n;
            nums[temp] += n;
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0 ;i < n; i++) {
            if (nums[i] <= n)
                list.add(i + 1);
        }

        return list;
    }
}
