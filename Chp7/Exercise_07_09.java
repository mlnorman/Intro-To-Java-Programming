/*
    Write a method that finds the smallest element in an
    array of double values using the following header:
    public static double min(double[] array)
    Write a test program that prompts the user to enter ten numbers, invokes this
    method to return the minimum value, and displays the minimum value.
*/

import java.util.Scanner;

public class Exercise_07_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] vals = new double[10];
        System.out.print("Enter 10 number: ");
        
        for (int i = 0; i < vals.length; i++) {
            vals[i] = in.nextDouble();
        }

        System.out.printf("The minimum number is: %.2f",min(vals));
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double val : array) {
            if (val < min)
                min = val;
        }
        return min;
    }
}