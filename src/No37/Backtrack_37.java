package No37;

/**
 * Name: Donghang He
 * Date: 2023/4/5 5:49 下午
 * Description:
 */
public class Backtrack_37 {
    public void solveSudoku(char[][] board) {
        backtrack(board, 0, 0);
    }

    private boolean backtrack(char[][] board, int i, int j) {
        int m = 9, n = 9;
        if (j == n)
            return backtrack(board, i + 1, 0);
        if (i == m)
            return true;
        if (board[i][j] != '.')
            return backtrack(board, i, j + 1);
        for (char ch = '1'; ch <= '9'; ch++) {
            if (!isValid(board, i, j, ch)) {
                continue;
            }
            board[i][j] = ch;
            if (backtrack(board, i, j + 1))
                return true;
            board[i][j] = '.';
        }
        return false;
    }

    private boolean isValid(char[][] board, int i, int j, char cur) {
        for (int l = 0; l < 9; l++) {
            if (board[i][l] == cur)
                return false;
            if (board[l][j] == cur)
                return false;
            if (board[i / 3 * 3 + l / 3][j / 3 * 3 + l % 3] == cur)
                return false;
        }
        return true;
    }
}
