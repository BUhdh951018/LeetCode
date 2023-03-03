package No438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/2/28 2:56 下午
 * Description:
 */
public class Window_438 {
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen)
            return new ArrayList<Integer>();

        List<Integer> ans = new ArrayList<>();
        int[] count = new int[26];
        for (int i = 0; i < pLen; i++) {
            ++count[s.charAt(i) - 'a'];
            --count[p.charAt(i) - 'a'];
        }

        int differ = 0;
        for (int i = 0; i < 26; i++)
            if (count[i] != 0)
                differ++;

        if (differ == 0)
            ans.add(0);

        for (int i = 0; i < sLen - pLen; i++) {
            int temp = count[s.charAt(i) - 'a'];
            if (temp == 1) {
                differ--;
            } else if (temp == 0) {
                differ++;
            }
            --count[s.charAt(i) - 'a'];

            if (count[s.charAt(i + pLen) - 'a'] == -1)
                differ--;
            else if (count[s.charAt(i + pLen) - 'a'] == 0)
                differ++;

            ++count[s.charAt(i + pLen) - 'a'];

            if (differ == 0)
                ans.add(i + 1);
        }

        return ans;
    }
}
