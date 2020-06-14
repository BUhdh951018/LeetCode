package No14;

public class Basic_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String ans = strs[0];

        for (int i = 0; i < strs.length; i++) {
            int j;
            for (j = 0; j < ans.length() && j < strs[i].length(); j++) {
                if (ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);

        }

        return ans;
    }
}
