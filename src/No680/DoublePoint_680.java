package No680;

/**
 * Name: Donghang He
 * Date: 2022/5/31 4:48 下午
 * Description:
 */
public class DoublePoint_680 {
    public boolean validPalindrome(String s) {

        int first = 0, second = s.length() - 1;
        while (first < second) {
            if (s.charAt(first) != s.charAt(second)) {
                return validPalindrome(s, first, second - 1) || validPalindrome(s, first + 1, second);
            }
            first++;
            second--;
        }

        return true;
    }

    private boolean validPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }

        return true;
    }
}
