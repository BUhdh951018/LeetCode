package No26;

/**
 * Name: Donghang He
 * Date: 2022/4/14 8:52 下午
 * Description:
 */
public class TwoPoint_26 {
    public int removeDuplicates(int[] nums) {
        int slow = 1, fast = 1;
        while (slow < nums.length) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }
}
