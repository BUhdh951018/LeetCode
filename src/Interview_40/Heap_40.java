package Interview_40;

import java.util.PriorityQueue;
import java.util.Queue;

public class Heap_40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0)
            return new int[0];

        Queue<Integer> heap = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));

        for (int num: arr) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] ans = new int[k];
        int j = 0;
        for (int i: heap)
            ans[j++] = i;

        return ans;
    }
}
