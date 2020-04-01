package No3;

import java.util.HashMap;
import java.util.Map;

public class solution_3 {
    public static int lengthOfLongestSubstring(String s){
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < s.length(); end++){
            char a = s.charAt(end);
            if (map.containsKey(a)){
                start = Math.max(map.get(a), start);
                //System.out.println(map.get(a));
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end+1);
            System.out.println(map);
        }
        return ans;
    }

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("pwwkew");
        System.out.println(i);
    }
}
