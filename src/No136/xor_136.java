package No136;

public class xor_136 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num: nums) {
            ans ^= num;
        }
        return ans;
    }
}
