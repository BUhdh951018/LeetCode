package No392;

/**
 * Name: Donghang He
 * Date: 2022/4/24 4:58 下午
 * Description:
 */
public class Greedy_392 {
    public boolean isSubsequence(String s, String t) {
        int len = s.length();
        if (len == 0)
            return true;
        int len1 = t.length();
        int temp = 0;
        for (int i = 0; i < len; i++) {
            for (int j = temp; j < len1; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    temp = j + 1;
                    if (i == len - 1)
                        return true;
                    break;
                }
                if (j == len1 - 1)
                    return false;
            }

        }

        return false;
    }

    public boolean isSubsequence1(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == - 1)
                return false;
        }

        return true;
    }
}
