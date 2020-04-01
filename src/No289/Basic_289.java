package No289;

public class Basic_289 {
    public void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[] neighbor = {-1, 0, 1};
        int[][] copy = new int[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                copy[i][j] = board[i][j];
            }

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                int count = 0;

                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        if (!(neighbor[m] == 0 && neighbor[n] == 0)) {
                            int new_i = i + neighbor[m];
                            int new_j = j + neighbor[n];

                            if ((0 <= new_i && new_i < row) && (0 <= new_j && new_j < col) && (copy[new_i][new_j] == 1)) {
                                count++;
                            }
                        }
                    }
                }

                if ((copy[i][j] == 1) && (count < 2 || count > 3)) {
                    board[i][j] = 0;
                }

                if (copy[i][j] == 0 && count == 3) {
                    board[i][j] = 1;
                }
            }
    }
}
