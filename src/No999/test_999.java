package No999;

public class test_999 {
    public static void main(String[] args) {
        String[][] board = {
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", "p", ".", ".", ".", "."},
                {".", ".", ".", "R", ".", ".", ".", "p"},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", "p", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", ".", ".", "."}
        };

        System.out.println(new Count_999().numRookCapture(board));
    }
}
