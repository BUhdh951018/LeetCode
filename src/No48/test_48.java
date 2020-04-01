package No48;

import java.util.Arrays;

public class test_48 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        new solution_48().rotate(matrix);

        for (int i = 0; i < 3; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
