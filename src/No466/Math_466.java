package No466;

public class Math_466 {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int index = 0;
        int count1 = 0;
        int count2 = 0;

        while (count1 < n1) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(index)) {
                    if (index == s2.length() - 1) {
                        count2++;
                        index = 0;
                    } else {
                        index++;
                    }
                }
            }
            count1++;
        }

        return count2 / n2;
    }
}
