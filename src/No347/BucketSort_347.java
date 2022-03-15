package No347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BucketSort_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            map.merge(num, 1, Integer::sum);
        }

        List<Integer>[] list = new List[nums.length + 1];

        for (int key: map.keySet()) {
            int i = map.get(key);
            if (list[i] == null) {
                list[i] = new ArrayList<>();
            }

            list[i].add(key);
        }

        for (int i = list.length - 1; i >= 0 && ans.size() < k; i--) {
            if (list[i] == null)
                continue;
            ans.addAll(list[i]);
        }

        return ans;
    }
}
