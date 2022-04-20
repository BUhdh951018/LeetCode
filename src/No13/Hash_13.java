package No13;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2022/4/14 8:37 下午
 * Description:
 */
public class Hash_13 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int temp = 0;
            char c = s.charAt(i);
            char next = s.charAt(i + 1);
            if (map.get(c) < map.get(next)) {
                temp = -map.get(c);
            } else {
                temp = map.get(c);
            }
            System.out.println(temp);
            res += temp;
        }

        return res + map.get(s.charAt(s.length() - 1));
    }
}
