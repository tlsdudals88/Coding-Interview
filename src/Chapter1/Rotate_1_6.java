package Chapter1;

/**
 * Created by Youngmin on 2016. 6. 20..
 */

// Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
// write a method to rotate the image by 90 degrees. Can you do this in place?

public class Rotate_1_6 {
    public static void main(String[] args) {

        int[][] matrix1 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int[][] matrix2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] expected_matrix1;
        int[][] expected_matrix2;

        System.out.println("initial value1");
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("initial value2");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        expected_matrix1 = rotate(matrix1);
        expected_matrix2 = rotate(matrix2);

        /*
            {13,9,5,1},
            {14,10,6,2},
            {15,11,7,3},
            {16,12,8,4}
         */
        System.out.println();
        System.out.println("rotate value1");
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(expected_matrix1[i][j] + " ");
            }
            System.out.println();
        }

        /*
            {7,4,1},
            {8,5,2},
            {9,6,3}
         */
        System.out.println();
        System.out.println("rotate value2");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(expected_matrix2[i][j] + " ");
            }
            System.out.println();
        }


    }

    // assume that each space of 4 bytes is integer value.
    public static int[][] rotate(int[][] matrix) {

        // new[0][0] = old[2][0]
        // new[0][1] = old[1][0]
        // new[0][2] = old[0][0]

        // new[1][0] = old[2][1]
        // new[1][1] = old[1][1]
        // new[1][2] = old[0][1]

        // new[2][0] = old[2][2]
        // new[2][1] = old[2][1]
        // new[2][2] = old[2][1]

        int[][] result_matrix = new int[matrix.length][matrix.length];

        // O(n2)
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                result_matrix[i][j] = matrix[matrix.length-1-j][i];
            }
        }
        return result_matrix;
    }
}
