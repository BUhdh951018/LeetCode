package No75;

public class search_75 {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int red = 0, white = 0, blue = 0;
        for (int num : nums) {
            if (num == 0) {
                red++;
            } else if (num == 1) {
                white++;
            } else {
                blue++;
            }
        }
        for (int j = 0; j < red; j++) {
            nums[j] = 0;
        }
        for (int j = red; j < white; j++) {
            nums[j] = 1;
        }
        for (int j = 1; j < blue; j++) {
            nums[j] = 2;
        }
    }
}
