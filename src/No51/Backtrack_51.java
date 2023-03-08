package No51;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Donghang He
 * Date: 2023/3/7 6:49 下午
 * Description:
 */
public class Backtrack_51 {
    private List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res = new ArrayList<>();

        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                sb.append('.');
            }
            board.add(sb.toString());
        }

        backtrack(board, 0);

        return res;
    }

    private void backtrack(List<String> board, int row) {
        if (row == board.size()) {
            res.add(new ArrayList<>(board));
            return;
        }

        int len = board.get(row).length();
        for (int i = 0; i < len; i++) {
            if(!isValid(board, i, row))
                continue;

            StringBuilder sb = new StringBuilder(board.get(row));
            sb.setCharAt(i, 'Q');
            board.set(row, sb.toString());

            backtrack(board, row + 1);
            sb.setCharAt(i, '.');
            board.set(row, sb.toString());
        }
    }

    private boolean isValid(List<String> board, int col, int row) {
        int len = board.size();

        for (String s : board) {
            if (s.charAt(col) == 'Q')
                return false;
        }

        for (int i = col - 1, j = row - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(j).charAt(i) == 'Q')
                return false;
        }

        for (int i = col + 1, j = row - 1; i < len && j >= 0; i++, j--){
            if (board.get(j).charAt(i) == 'Q')
                return false;
        }

        return true;
    }
}
