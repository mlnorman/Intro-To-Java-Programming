/*
    Write a program that reads ten integers and displays
    them in the reverse of the order in which they were read.
*/

import java.util.Scanner;

public class Exercise_07_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] values = new int[10];
    
        System.out.print("Enter 10 integer values: ");

        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }

        System.out.println("Values in reverse order.");
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.printf("%d ", values[i]);
        }
        System.out.println();
    }


}