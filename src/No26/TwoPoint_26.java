package No26;

/**
 * Name: Donghang He
 * Date: 2022/4/14 8:52 下午
 * Description:
 */
public class TwoPoint_26 {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 0;

        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
            fast++;
        }

        return slow + 1;
    }
}
