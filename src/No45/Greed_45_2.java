package No45;

public class Greed_45_2 {
    public int jump(int[] nums) {
        int steps = 0;

        int position = nums.length - 1;

        while (position != 0) {
            for (int i = 0; i < position; i++) {
                if (nums[i] >= position - i) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }

        return steps;
    }
}
