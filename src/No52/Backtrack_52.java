package No52;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/7 7:16 下午
 * Description:
 */
public class Backtrack_52 {
    private int res;

    public int totalNQueens(int n) {
        res = 0;
        List<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append('.');
            }
            board.add(sb.toString());
        }

        backtrack(board, 0);
        return res;
    }

    private void backtrack(List<String> board, int row) {
        if (row == board.size()) {
            res++;
            return;
        }

        int len = board.get(row).length();
        for (int col = 0; col < len; col++) {
            if (!isValid(board, row, col))
                continue;

            StringBuilder sb = new StringBuilder(board.get(row));
            sb.setCharAt(col, 'Q');
            board.set(row, sb.toString());

            backtrack(board, row + 1);

            sb.setCharAt(col, '.');
            board.set(row, sb.toString());
        }
    }

    private boolean isValid(List<String> board, int row, int col) {
        for (String str : board)
            if (str.charAt(col) == 'Q')
                return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.get(row).length(); i--, j++) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }

        return true;
    }
}
