package No409;

public class Greedy_409 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
            System.out.println(c);
        }

        int ans = 0;
        for (int i : count) {
            if (i % 2 == 0) {
                ans += i;
            } else {
                ans += i / 2 * 2;
                if (ans % 2 == 0)
                    ans++;
            }
        }

        return ans;
    }
}
