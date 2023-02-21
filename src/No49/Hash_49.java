package No49;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/2/16 7:11 下午
 * Description:
 */
public class Hash_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            List<String> word;
            if (map.containsKey(temp)) {
                word = map.get(temp);
            } else {
                word = new ArrayList<>();
            }
            word.add(s);
            map.put(temp, word);
        }

        return new ArrayList<>(map.values());
    }
}
