package No345;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Name: Donghang He
 * Date: 2022/5/31 4:32 下午
 * Description:
 */
public class DoublePoint_345 {
    public String reverseVowels(String s) {

        HashSet<Character> vowels = new HashSet<>(
                Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I','O', 'U')
        );
        int first = 0, second = s.length() - 1;

        char[] res = new char[s.length()];
        while (first <= second) {
            char fir = s.charAt(first);
            char sec = s.charAt(second);
            if (!vowels.contains(fir))
                res[first++] = fir;
            else if (!vowels.contains(sec))
                res[second--] = sec;
            else {
                res[first++] = sec;
                res[second--] = fir;
            }
        }

        return new String(res);
    }
}
