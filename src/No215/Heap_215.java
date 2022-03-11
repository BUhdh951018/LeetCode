package No215;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Heap_215 {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

        for (int num: nums) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }

        }
        return heap.poll();
    }
}
