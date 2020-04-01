package No55;

public class backtrack_55 {
    public boolean canJump(int[] nums) {
        return canJumpToEnd(0, nums);
    }

    public boolean canJumpToEnd(int position, int[] nums) {
        int len = nums.length - 1;
        if (position == len) {
            return true;
        }

        int farest = Math.min(position + nums[position], len);
        for (int i = position + 1; i <= farest; i++) {
            if(canJumpToEnd(i, nums)) {
                return true;
            }
        }

        return false;
    }
}
