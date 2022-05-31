package No524;

import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/5/31 5:24 下午
 * Description:
 */
public class DoublePoint_524 {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        for (String temp : dictionary) {

            int l1 = res.length(), l2 = temp.length();
            if (l1 > l2 || (l1 == l2) && res.compareTo(temp) < 0)
                continue;

            int i = 0, j = 0;
            while (i < s.length() && j < temp.length()) {
                if (s.charAt(i) == temp.charAt(j)) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            if (j == temp.length()) {
                res = temp;
            }
        }

        return res;
    }
}
