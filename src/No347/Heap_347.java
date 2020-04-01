package No347;

import java.util.*;

public class Heap_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2));

        for (int n : map.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        List<Integer> ans = new LinkedList<>();

        while (!heap.isEmpty()) {
            ans.add(heap.poll());
        }
        Collections.reverse(ans);

        return ans;
    }
}
