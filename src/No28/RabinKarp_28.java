package No28;

/**
 * Name: Donghang He
 * Date: 2023/3/15 3:41 下午
 * Description:
 */
public class RabinKarp_28 {
    public int strStr(String haystack, String needle) {
        int L = needle.length();
        int R = 256;
        long Q = 1658598167;
        long RL = 1;
        for (int i = 1; i <= L - 1; i++) {
            RL = (RL * R) % Q;
        }

        long needleHash = 0;
        for (int i = 0; i < L; i++) {
            needleHash = (R * needleHash + needle.charAt(i)) % Q;
        }

        long window = 0;
        int left = 0, right = 0;

        while (right < haystack.length()) {
            window = ((R * window) % Q + haystack.charAt(right++)) % Q;

            if (right - left == L) {
                if (window == needleHash) {
                    if (needle.equals(haystack.substring(left, right)))
                        return left;
                }
                window = (window - (haystack.charAt(left++) * RL) % Q + Q) % Q;
            }

        }

        return -1;
    }
}
