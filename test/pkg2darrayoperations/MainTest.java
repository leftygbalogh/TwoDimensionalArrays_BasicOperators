/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrayoperations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lefty
 */
public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of TwoDMatrixToString method, of class Main.
     */
    @Test
    public void testTwoDMatrixToString() {

        System.out.println();
        System.out.println("TwoDMatrixToString");
        System.out.println("Case 1 - 2x2 matrix");
        int[][] _array = new int[][]{{1, 2}, {3, 4}};
        String expResult = "1, 2\n3, 4\n";
        String result = Main.TwoDMatrixToString(_array);
        System.out.println(result);
        assertEquals(expResult, result);

        System.out.println("TwoDMatrixToString");
        System.out.println("Case 2 - 2x4 matrix");
        int[][] _array2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        String expResult2 = "1, 2, 3, 4\n5, 6, 7, 8\n";
        String result2 = Main.TwoDMatrixToString(_array2);
        System.out.println(result2);
        assertEquals(expResult2, result2);

    }

    /**
     * Test of Add2DMatrices method, of class Main.
     */
    @Test
    public void testAdd2DMatrices() {
        System.out.println();
        System.out.println("Add2DMatrices");
        System.out.println("Case 1 - 2x2 matrix");
        int[][] matrix1 = new int[][]{{1, 2}, {3, 4}};
        int[][] matrix2 = new int[][]{{5, 6}, {7, 8}};
        int[][] expResult = new int[][]{{6, 8}, {10, 12}};
        int[][] result = Main.Add2DMatrices(matrix1, matrix2);
        System.out.println("matrix1\n" + Main.TwoDMatrixToString(matrix1));
        System.out.println("matrix2\n" + Main.TwoDMatrixToString(matrix2));
        System.out.println("expResult\n" + Main.TwoDMatrixToString(expResult));
        System.out.println("Result\n" + Main.TwoDMatrixToString(result));

        assertArrayEquals(expResult, result);

        System.out.println();
        System.out.println("Add2DMatrices");
        System.out.println("Case 2 - 2x4 matrix");
        int[][] matrix1b = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[][] matrix2b = new int[][]{{9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] expResultb = new int[][]{{10, 12, 14, 16}, {18, 20, 22, 24}};
        int[][] resultb = Main.Add2DMatrices(matrix1b, matrix2b);
        System.out.println("matrix1\n" + Main.TwoDMatrixToString(matrix1b));
        System.out.println("matrix2\n" + Main.TwoDMatrixToString(matrix2b));
        System.out.println("expResult\n" + Main.TwoDMatrixToString(expResultb));
        System.out.println("Result\n" + Main.TwoDMatrixToString(resultb));

        assertArrayEquals(expResultb, resultb);

    }

    /**
     * Test of Multiply2DMatrices method, of class Main.
     */
    @Test
    public void testMultiply2DMatrices() {
        System.out.println("Multiply2DMatrices");
        System.out.println("Case 1 - 2x2 matrix");
        int[][] matrix1 = new int[][]{{1, 2}, {3, 4}};
        int[][] matrix2 = new int[][]{{5, 6}, {7, 8}};
        int[][] expResult = new int[][]{{5, 12}, {21, 32}};

        int[][] result = Main.Multiply2DMatrices(matrix1, matrix2);

        System.out.println("matrix1\n" + Main.TwoDMatrixToString(matrix1));
        System.out.println("matrix2\n" + Main.TwoDMatrixToString(matrix2));
        System.out.println("expResult\n" + Main.TwoDMatrixToString(expResult));
        System.out.println("Result\n" + Main.TwoDMatrixToString(result));

        assertArrayEquals(expResult, result);

    }

    /**
     * Test of Divide2DMatrices method, of class Main.
     */
    @Test
    public void testDivide2DMatrices() {
        System.out.println("Divide2DMatrices");

        System.out.println("Case 1 - 2x2 matrix");
        int[][] matrix1 = new int[][]{{10, 24}, {35, 41}};
        int[][] matrix2 = new int[][]{{5, 6}, {7, 8}};
        int[][] expResult = new int[][]{{2, 4}, {5, 5}};

        int[][] result = Main.Divide2DMatrices(matrix1, matrix2);

        System.out.println("matrix1\n" + Main.TwoDMatrixToString(matrix1));
        System.out.println("matrix2\n" + Main.TwoDMatrixToString(matrix2));
        System.out.println("expResult\n" + Main.TwoDMatrixToString(expResult));
        System.out.println("Result\n" + Main.TwoDMatrixToString(result));

        assertArrayEquals(expResult, result);

    }

    /**
     * Test of Subtract2DMatrices method, of class Main.
     */
    @Test
    public void testSubtract2DMatrices() {
        System.out.println("Subtract2DMatrices");

        System.out.println("Case 1 - 2x2 matrix");
        int[][] matrix1 = new int[][]{{10, 24}, {35, 41}};
        int[][] matrix2 = new int[][]{{5, 6}, {7, 58}};
        int[][] expResult = new int[][]{{5, 18}, {28, -17}};

        int[][] result = Main.Subtract2DMatrices(matrix1, matrix2);

        System.out.println("matrix1\n" + Main.TwoDMatrixToString(matrix1));
        System.out.println("matrix2\n" + Main.TwoDMatrixToString(matrix2));
        System.out.println("expResult\n" + Main.TwoDMatrixToString(expResult));
        System.out.println("Result\n" + Main.TwoDMatrixToString(result));

        assertArrayEquals(expResult, result);

    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        
    }

}
