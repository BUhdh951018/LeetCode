package No710;

import java.util.HashMap;
import java.util.Map;

/**
 * Name: Donghang He
 * Date: 2023/3/15 5:39 下午
 * Description:
 */
public class Solution {

    private final int sz;
    private final Map<Integer, Integer> map;

    public Solution(int n, int[] blacklist) {
        sz = n - blacklist.length;
        map = new HashMap<>();

        for (int b : blacklist)
            map.put(b, 666);

        int last = n - 1;
        for (int b : blacklist) {
            if (b >= sz)
                continue;
            while (map.containsKey(last))
                last--;
            map.put(b, last);
            last--;
        }
    }

    public int pick() {
        int index = (int) (Math.random() * sz);
        return map.getOrDefault(index, index);
    }
}
