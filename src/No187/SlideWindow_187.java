package No187;

import java.util.*;

/**
 * Name: Donghang He
 * Date: 2023/3/15 3:13 下午
 * Description:
 */
public class SlideWindow_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A':
                    nums[i] = 0;
                    break;
                case 'G':
                    nums[i] = 1;
                    break;
                case 'C':
                    nums[i] = 2;
                    break;
                case 'T':
                    nums[i] = 3;
                    break;
            }
        }

        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> res = new HashSet<>();

        int left = 0, right = 0;

        int R = 4;
        int L = 10;

        int window = 0;
        while (right < s.length()) {
            window = window * R + nums[right++];

            if (right - left == L) {
                if (seen.contains(window))
                    res.add(s.substring(left, right));
                else
                    seen.add(window);
                window = window - nums[left++] * (int) Math.pow(R, L - 1);
            }
        }

        return new ArrayList<>(res);
    }
}
