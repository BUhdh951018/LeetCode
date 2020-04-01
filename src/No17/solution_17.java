package No17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class solution_17 {
    HashMap<String, String> collection = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};


    List<String> result = new ArrayList<String>();

    private void backtrack(String ans, String digit) {

        if (digit.length() == 0) {
            result.add(ans);
        }else {
            String number = digit.substring(0, 1);
            String letterS = collection.get(number);
            for (int i = 0; i < letterS.length(); i++) {
                String letter = collection.get(number).substring(i, i+1);
                backtrack(ans + letter, digit.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0) {
            backtrack("", digits);
        }
        return result;
    }
}
