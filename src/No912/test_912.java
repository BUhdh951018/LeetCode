package No912;

public class test_912 {
    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        int[] res = new QuickSort_912().sortArray(nums);
        int[] nums1 = {5, 1, 1, 2, 0, 0};
        int[] ans = new heap_912().sortArray(nums1);
        for (int num: res)
            System.out.println(num);

        for (int i: ans)
            System.out.println(i);

        int[] queues = new new_912().sortArray(nums);
        for (int queue: queues)
            System.out.println(queue);
    }
}
