package No79;

public class dfs_79 {
    int m, n;
    private boolean[][] marked;
    private final int[][] direction = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        marked = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int start, char[][] board, String word) {
        if (board[i][j] != word.charAt(start)) {
            return false;
        }
        if (start == word.length() - 1) {
            return board[i][j] == word.charAt(start);
        }

        marked[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int newX = i + direction[k][0];
            int newY = j + direction[k][1];
            if (inArea(newX, newY) && !marked[newX][newY]) {
                if (dfs(newX, newY, start + 1, board, word)) {
                    return true;
                }
            }
        }
        marked[i][j] = false;

        return false;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
