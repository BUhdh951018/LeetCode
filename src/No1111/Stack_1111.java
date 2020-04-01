package No1111;

public class Stack_1111 {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        int depth = 0;
        for (int i = 0; i < seq.length(); i++) {
            char temp = seq.charAt(i);
            if (temp == '(') {
                depth++;
                ans[i] = depth % 2;
            }

            if (temp == ')') {
                ans[i] = depth % 2;
                depth--;
            }
        }

        return ans;
    }
}
