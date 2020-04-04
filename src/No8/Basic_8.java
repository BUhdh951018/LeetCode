package No8;

public class Basic_8 {
    public int myAtoi(String str) {
        int len = str.length();

        int index = 0;
        while (index < len) {
            if (str.charAt(index) != ' ') {
                break;
            }
            index++;
        }

        if (index == len) {
            return 0;
        }

        int sign = 1;
        char first = str.charAt(index);
        if (first == '+') {
            index++;
        } else if (first == '-') {
            index++;
            sign = -1;
        }

        int ans = 0;
        while (index < len) {
            char curr = str.charAt(index);

            if (curr >'9' || curr < '0') {
                break;
            }

            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && (curr - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && (curr - '0') > -(Integer.MIN_VALUE % 10))){
                return Integer.MIN_VALUE;
            }

            ans = ans * 10 + sign * (curr - '0');
            index++;
        }

        return ans;
    }
}
