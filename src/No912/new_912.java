package No912;

import java.util.PriorityQueue;
import java.util.Queue;

public class new_912 {
    public int[] sortArray(int[] nums) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        for (int num: nums) {
            priorityQueue.add(num);
        }
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = priorityQueue.poll();
        }

        return nums;
    }
}
