package No451;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/3/13 7:41 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class BucketSort_451 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char temp : s.toCharArray()) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        List<Character>[] list = new List[s.toCharArray().length + 1];

        for (char key : map.keySet()) {
            int temp = map.get(key);
            if (list[temp] == null) {
                list[temp] = new ArrayList<>();
            }
            list[temp].add(key);
        }

        StringBuilder ans = new StringBuilder();

        for (int j = list.length - 1; j >0; j--) {
            if (list[j] == null)
                continue;
            for (char c : list[j]) {
                for (int i = 0; i < j; i++) {
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
}
