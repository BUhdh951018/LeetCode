package No647;

/**
 * Name: Donghang He
 * Date: 2022/3/23 8:08 下午
 * Description:
 */
public class String_647 {
    private int cnt = 0;

    public int countSubstrings(String s) {

        for (int i = 0; i < s.length(); i++) {
            extendSubstrings(s, i, i);
            extendSubstrings(s, i ,i+1);
        }
        return cnt;
    }

    private void extendSubstrings(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
            cnt++;
        }
    }
}
