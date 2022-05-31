package No524;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2022/5/31 5:31 下午
 * Description:
 */
public class test_524 {
    public static void main(String[] args) {
        String s = "abce";
        List<String> dictionary = new ArrayList<String>();
        dictionary.add("abe");
        dictionary.add("abc");
        dictionary.add("a");
        dictionary.add("plea");

        System.out.println(new DoublePoint_524().findLongestWord(s, dictionary));
    }
}
