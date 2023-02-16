package No17;

import java.util.List;

public class test_17 {
    public static void main(String[] args) {
        backtrack_17 result = new backtrack_17();
        String digits = "23";
        List<String> ans = result.letterCombinations(digits);
        System.out.println(ans);
    }
}
