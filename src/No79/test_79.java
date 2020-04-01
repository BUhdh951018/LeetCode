package No79;

public class test_79 {
    public static void main(String[] args) {
        char[][] board ={
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        Boolean ans = new dfs_79().exist(board, word);
        System.out.println(ans);
    }
}
