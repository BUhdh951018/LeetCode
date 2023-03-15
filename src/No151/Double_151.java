package No151;

import java.util.Arrays;

/**
 * Name: Donghang He
 * Date: 2023/3/14 7:56 下午
 * Description:
 */
public class Double_151 {
    public String reverseWords(String s) {
        int left = 0, right = s.length() - 1;
        while (s.charAt(left) == ' ')
            left++;
        while (s.charAt(right) == ' ')
            right--;
        s = s.substring(left, right + 1);
        StringBuilder sb = new StringBuilder();
        right = left;
        left = 0;
        while (right < s.length()) {
            if (s.charAt(right) == ' ' && s.charAt(right + 1) == ' ') {
                sb.append(s, left, right);
                left = right + 1;
            }
            right++;
        }
        sb.append(s, left, right);
        s = sb.toString();

        left = 0;
        right = s.length() - 1;
        char[] res = s.toCharArray();

        while (left < right) {
            char c = res[left];
            res[left] = res[right];
            res[right] = c;
            left++;
            right--;
        }

        left = 0;
        right = 0;
        while (right < s.length()) {
            if (res[right] == ' ') {
                reverse(res, left, right - 1);
                left = right + 1;
                right++;
            }
            right++;
        }
        reverse(res, left, right - 1);
        System.out.println(Arrays.toString(res));
        return new String(res);
    }

    private void reverse(char[] c, int i, int j) {
        while (i < j) {
            char d = c[i];
            c[i] = c[j];
            c[j] = d;
            i++;
            j--;
        }
    }
}
