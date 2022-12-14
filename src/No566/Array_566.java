package No566;

/**
 * Name: Donghang He
 * Date: 2022/12/12 12:27 下午
 * Description:
 */
public class Array_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c)
            return mat;

//        int[] temp = new int[m * n]
//        int tep = 0;
//        for (int[] ints : mat)
//            for (int anInt : ints)
//                temp[tep++] = anInt;
//        int flag = 0;
//        for (int i = 0; i < r; i++)
//            for (int j = 0; j < c; j++)
//                res[i][j] = temp[flag++];

        int temp = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                res[i][j] = mat[temp / n][temp % n];
                temp++;
            }

        return res;
    }
}
