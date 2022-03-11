package No9;

/**
 * Name: Donghang He
 * Date: 2022/3/11 5:45 下午
 * Course: CS-
 * Assignment
 * Description:
 */
public class Basic_9 {
    public boolean isPalindrome(int x) {
        String temp = x + "";
        return (x + "").equals(new StringBuilder(temp).reverse().toString());
    }

    public boolean isPalindrome1(int x) {
        if (x < 0 || x % 10 == 0 && x != 0)
            return false;
        int temp = 0;
        while (x > temp) {
            temp = temp * 10 + x % 10;
            x /= 10;
        }

        return x == temp || x == temp / 10;
    }
}
