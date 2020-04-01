package No39;

import java.util.ArrayList;
import java.util.List;

public class solution_39 {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        if (len == 0) {
            return ans;
        }

        dfs(new ArrayList(), candidates, target, 0, 0);
        return ans;
    }

    private void dfs(List<Integer> list, int[] candidates, int target, int sum, int start) {
        for (int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            if ((sum + candidates[i]) == target) {
                List<Integer> temp = new ArrayList<>(list);
                ans.add(temp);
            } else if ((sum + candidates[i]) < target) {
                dfs(list, candidates, target, sum + candidates[i], i);
            } else {
                list.remove(list.size() - 1);
                break;
            }
            list.remove(list.size() - 1);
        }
    }
}
