package No136;

public class xor_136 {
    // 二进制操作
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num: nums) {
            ans ^= num;
            System.out.println(ans);
        }
        return ans;
    }
}
