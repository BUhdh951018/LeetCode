package No696;

/**
 * Name: Donghang He
 * Date: 2022/3/23 8:19 下午
 * Description:
 */
public class String_696 {
    public int countBinarySubstrings(String s) {
        int preLen = 0, curLen = 1, count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curLen++;
            } else {
                preLen = curLen;
                curLen = 1;
            }

            if (preLen >= curLen)
                count++;
        }

        return count;
    }
}
