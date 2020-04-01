package No999;

public class Count_999 {
    public int numRookCapture(String[][] board) {
        int ans = 0, r_i = 0, r_j = 0;
        int[] x = {0 ,0, 1, -1};
        int[] y = {1, -1, 0 ,0};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8; j++) {
                if (board[i][j] == "R") {
                    r_i = i;
                    r_j = j;
                    break;
                }
            }
        }

        for (int m = 0; m < 4; m++) {
            for (int step = 0; step < 8; step++) {
                int n_i = r_i + x[m] * step;
                int n_j = r_j + y[m] * step;
                
                if (n_i < 0 || n_i >= 8 || n_j < 0 || n_j >= 8 || board[n_i][n_j] == "B")
                    break;

                if (board[n_i][n_j] == "p"){
                    ans++;

                    break;
                }
            }
        }
        return ans;
    }
}
