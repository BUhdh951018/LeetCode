package No139;

import java.util.ArrayList;
import java.util.List;

public class test_139 {
    public static void main(String[] args) {
        String s = "catsandog";
        String s1 = "catsanddog";
        List<String> dict = new ArrayList<>();
        dict.add("cat");
        dict.add("cats");
        dict.add("sand");
        dict.add("and");
        dict.add("dog");
        System.out.println(new memory_139().wordBreak(s, dict));
        System.out.println(new DP_139().wordBreak(s1, dict));
    }
}
