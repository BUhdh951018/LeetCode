package No75;

public class DutchNational_75 {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int p0 = 0;
        int p2 = len - 1;
        int curr = 0;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                int temp = nums[curr];
                nums[curr] = nums[p0];
                nums[p0] = temp;
                p0++;
                curr++;
            } else if (nums[curr] == 1) {
                curr++;
            } else {
                int temp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2] = temp;
                p2--;
            }
        }
    }
}
