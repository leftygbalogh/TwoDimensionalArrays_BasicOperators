/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrayoperations;

/**
 *
 * @author lefty
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    /**
     * Creates a String of the int elements in a two-dimensional array. Elements
     * are separated by a comma, rows are split by \n.
     *
     * @param _array must be am int[][]
     * @return returns a String with a line-break at the end;
     */
    public static String TwoDMatrixToString(int[][] _array) {
        String matrix = "";
        int last_index_in_row = _array[0].length - 1;
        for (int i = 0; i < _array.length; i++) {
            for (int j = 0; j < _array[0].length - 1; j++) {
                matrix = matrix + _array[i][j] + ", ";
            }
            matrix = matrix + _array[i][last_index_in_row] + "\n";
        }

        return matrix;
    }

    /**
     * Adds the elements on the same indexes in two matrices that are of the
     * same size.
     *
     * @param matrix1 must be int[][]
     * @param matrix2 must be int[][]
     * @return returns a new matrix with the results;
     */
    public static int[][] Add2DMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum_matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];

            }

        }

        return sum_matrix;
    }

    public static int[][] Multiply2DMatrices(int[][] matrix1, int[][] matrix2) {

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] multiplied_matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiplied_matrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return multiplied_matrix;
    }

    public static int[][] Divide2DMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] divided_matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                divided_matrix[i][j] = (int) matrix1[i][j] / matrix2[i][j];
            }
        }

        return divided_matrix;
    }

    public static int[][] Subtract2DMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] subtracted_matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                subtracted_matrix[i][j] =  matrix1[i][j] - matrix2[i][j];
            }
        }

        return subtracted_matrix;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
