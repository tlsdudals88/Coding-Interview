package Chapter1;

/**
 * Created by Youngmin on 2016. 6. 20..
 */

// Write an algorithm such that if an element in a MxN matrix is 0, its entire row and column are set 0.

public class SetZeros_1_7 {
    public static void main(String[] args) {

        int[][] matrix1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[][] matrix2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,0,12}
        };

        int[][] result_matrix1;
        int[][] result_matrix2;


        result_matrix1 = setZeros(matrix1);
        result_matrix2 = setZeros(matrix2);

        System.out.println("result1");
        for(int i=0; i<result_matrix1.length; i++) {
            for(int j=0; j<result_matrix1[0].length; j++) {
                System.out.print(result_matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("result2");
        for(int i=0; i<result_matrix2.length; i++) {
            for(int j=0; j<result_matrix2[0].length; j++) {
                System.out.print(result_matrix2[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] setZeros(int[][] matrix) {

        boolean bool = true;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0)
                    bool = false;
            }
        }

        if(bool == true)
            return matrix;
        else {
            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
            return matrix;
        }

    }
}
