package No744;

/**
 * Name: Donghang He
 * Date: 2022/6/2 7:34 下午
 * Description:
 */
public class BinarySearch_744 {
    public char nextGreatestLetter(char[] letters, char target) {
         int l = 0, h = letters.length - 1;

         while (l <= h) {
             int m = l + (h - l) / 2;
             if (letters[m] <= target)
                 l = m + 1;
             else
                 h = m - 1;
         }

         return l < letters.length ? letters[l] : letters[0];
    }
}
