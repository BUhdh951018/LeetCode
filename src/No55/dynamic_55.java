package No55;

public class dynamic_55 {
    enum Index {
        GOOD, BAD, UNKNOWN
    }

    Index[] memo;
    public boolean canJump(int[] nums) {
        memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;
        return canJumpToEnd(0, nums);
    }

    public boolean canJumpToEnd(int position, int[] nums) {
        if (memo[position] != Index.UNKNOWN) {
            return memo[position] == Index.GOOD;
        }

        int farest = Math.min(position + nums[position], nums.length - 1);
        for (int next = position + 1; next <= farest; next++) {
            if (canJumpToEnd(next, nums)) {
                memo[position] = Index.GOOD;
                return true;
            }
        }

        memo[position] = Index.BAD;
        return false;
    }
}
