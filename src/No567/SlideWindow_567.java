package No567;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2023/3/11 5:01 下午
 * Description:
 */
public class SlideWindow_567 {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : s1.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);
        System.out.println(need);

        int left = 0, right = 0;
        int valid = 0;

        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c)))
                    valid += window.get(c);
            }

            while (right - left >= s1.length()) {
                if (valid == s1.length())
                    return true;

                char d = s2.charAt(left);

                left++;
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid -= window.get(d);
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return false;
    }
}
