/*
    Write a method that returns the index of
    the smallest element in an array of integers. If the number of such elements is
    greater than 1, return the smallest index. Use the following header:
    public static int indexOfSmallestElement(double[] array)
    Write a test program that prompts the user to enter ten numbers, invokes this
    method to return the index of the smallest element, and displays the index.
*/

import java.util.Scanner;

public class Exercise_07_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] values = new double[10];
        System.out.print("Enter 10 number: ");
    
        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextDouble();
        }
        
        System.out.printf("The index of the smalles element is %d", indexOfSmallestElement(values));

    }


    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}