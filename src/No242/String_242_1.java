package No242;

/**
 * Name: Donghang He
 * Date: 2022/3/23 7:20 下午
 * Description:
 */
public class String_242_1 {
    public boolean isAnagram(String s, String t) {
        int[] ans = new int[26];
        for (char temp : s.toCharArray())
            ans[temp - 'a']++;
        for (char temp : t.toCharArray())
            ans[temp - 'a']--;
        for (int temp : ans) {
            if (temp != 0)
                return false;
        }

        return true;
    }
}
