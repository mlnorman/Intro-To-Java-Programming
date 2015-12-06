/*
    Write a method to add two matrices. The header of
    the method is as follows:
    public static double[][] addMatrix(double[][] a, double[][] b)
*/
import java.util.Scanner;

public class Exercise_08_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] matrixOne = new double[3][3];
        double[][] matrixTwo = new double[3][3];
            
        System.out.println("Enter matrix1 (3x3): ");
        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                matrixOne[i][j] = in.nextDouble();
            }
        }

        System.out.println("Enter matrix2 (3x3): ");
        for (int i = 0; i < matrixTwo.length; i++) {
            for (int j = 0; j < matrixTwo[i].length; j++) {
                matrixTwo[i][j] = in.nextDouble();
            }
        }

        double[][] sum = addMatrix(matrixOne, matrixTwo);
        System.out.println("The matricies added are as follows: ");

        for (int i = 0; i < matrixOne.length; i++) {
            System.out.printf("%.1f %.1f %.1f  %s  %.1f %.1f %.1f  %s  %.1f %.1f %.1f%n",
                matrixOne[i][0], matrixOne[i][1], matrixOne[i][2],
                i == 1 ? "+" : " ",
                matrixTwo[i][0], matrixTwo[i][1], matrixTwo[i][2],
                i == 1 ? "=" : " ",
                sum[i][0], sum[i][1], sum[i][2]);
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}