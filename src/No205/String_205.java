package No205;

/**
 * Name: Donghang He
 * Date: 2022/3/23 7:54 下午
 * Description:
 */
public class String_205 {
    public boolean isIsomorphic(String s, String t) {
        int[] first = new int[256];
        int[] second = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char f = s.charAt(i), sc = t.charAt(i);
            if (first[f] != second[sc])
                return false;

            first[f]++;
            second[sc]++;
        }

        return true;
    }
}
