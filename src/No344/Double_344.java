package No344;

/**
 * Name: Donghang He
 * Date: 2023/3/6 4:07 下午
 * Description:
 */
public class Double_344 {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;

        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
