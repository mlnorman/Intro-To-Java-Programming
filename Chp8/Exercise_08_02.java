/*
    Write a method that sums all the numbers in the major diagonal in an n*n 
    matrix of double values using the following header:
    public static double sumMajorDiagonal(double[][] m)                     
    Write a test program that reads a 4-by-4 matrix and displays the sum of all its
    elements on the major diagonal.
*/

import java.util.Scanner;

public class Exercise_08_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[][] m = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextDouble();
            }
        }
        
        System.out.printf("Sum of the slements in the major diagonal is %.1f",
            sumMajorDiagonal(m));
        
    }
    
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}