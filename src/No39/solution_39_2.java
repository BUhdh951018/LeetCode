package No39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution_39_2 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            ans.add(new ArrayList());
            return ans;
        }
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList());
        return ans;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> list) {
        if (target < 0)
            return;
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i]) {
                break;
            }
            list.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i, list);
            list.remove(list.size() - 1);
        }
    }
}
