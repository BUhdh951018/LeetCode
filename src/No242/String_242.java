package No242;

import java.util.HashMap;

/**
 * Name: Donghang He
 * Date: 2022/3/23 7:12 下午
 * Description:
 */
public class String_242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char temp : s.toCharArray()) {
            map1.put(temp, map1.getOrDefault(temp, 0) + 1);
        }

        for (char temp : t.toCharArray())
            map2.put(temp, map2.getOrDefault(temp, 0) + 1);

        if (map1.size() != map2.size())
            return false;
        for (char temp : map1.keySet()) {
            if (!map1.get(temp).equals(map2.get(temp)))
                return false;
        }

        return true;
    }
}
