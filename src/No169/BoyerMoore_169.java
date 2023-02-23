package No169;

public class BoyerMoore_169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int can = nums[0];
        for (int num : nums) {
            if (count == 0)
                can = num;
            count += can == num ? 1 : -1;
        }

        return can;
    }
}
