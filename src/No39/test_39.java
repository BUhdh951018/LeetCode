package No39;

import java.util.List;

public class test_39 {


    public static void main(String args[]){
        int[] can = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> ans = new dfs_39().combinationSum(can, target);
        List<List<Integer>> res = new backtrack_39().combinationSum(can, target);
        System.out.println(ans);
        System.out.println(res);
    }
}
