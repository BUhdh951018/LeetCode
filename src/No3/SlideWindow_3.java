package No3;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2023/3/11 5:42 下午
 * Description:
 */
public class SlideWindow_3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0;
        int res = 0;

        while (right < s.length()) {
            char c = s.charAt(right++);
            window.put(c, window.getOrDefault(c, 0) + 1);

            while (window.get(c) > 1) {
                char d = s.charAt(left++);
                window.put(d, window.getOrDefault(d, 0 ) - 1);
            }
            res = Math.max(res, right - left);
        }

        return res;
    }
}
