package No912;

public class heap_912 {
    public int[] sortArray(int[] nums) {
        heap_sort(nums);
        return nums;
    }

    private void heap_sort(int[] nums) {
        build_heap(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            max_heapify(nums, 0, i);
        }
    }

    private void build_heap(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            max_heapify(nums, i, nums.length);
        }
    }

    private void max_heapify(int[] nums, int root, int heap_len) {
        int p = root;
        int nex = 0;
        while (p * 2 + 1 < heap_len) {
            int left = p * 2 + 1, right = p * 2 + 2;

            if (heap_len <= right || nums[right] < nums[left]) {
                nex = left;
            } else {
                nex = right;
            }

            if (nums[p] < nums[nex]) {
                int temp = nums[p];
                nums[p] = nums[nex];
                nums[nex] = temp;
                p = nex;
            } else {
                break;
            }
        }
    }
}
