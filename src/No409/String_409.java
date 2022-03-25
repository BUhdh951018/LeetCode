package No409;

import java.util.HashMap;

/**
 * Name: Donghang He
 * Date: 2022/3/23 7:30 下午
 * Description:
 */
public class String_409 {
    public int longestPalindrome(String s) {
        int[] ans = new int[128];
        for (char temp : s.toCharArray())
            ans[temp]++;

        int res = 0;
        for (int temp : ans){
            res += (temp / 2) * 2;
        }

        if (res < s.length())
            res++;

        return res;
    }
}
