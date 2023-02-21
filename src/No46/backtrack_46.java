package No46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class backtrack_46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList();

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int num: nums){
            temp.add(num);
        }
        int len = nums.length;
        backtrack(len, result, temp, 0);
        return result;
    }

    public static void backtrack(int len, List<List<Integer>> result, ArrayList<Integer> temp, int start) {
        if (start == len) {
            result.add(new ArrayList<Integer>(temp));
        }

        for (int i = start; i < len; i++) {
            Collections.swap(temp, start, i);

            backtrack(len, result, temp, start + 1);

            Collections.swap(temp, start, i);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }

}
