/*
    Write a method with the following header to display three
    numbers in increasing order:
    public static void displaySortedNumbers(
    double num1, double num2, double num3)
    Write a test program that prompts the user to enter three numbers and invokes the
    method to display them in increasing order.
*/

import java.util.Scanner;

public class Exercise_06_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter 3 numbers seperated by a space(1 2 3): ");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();
    
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp; 
        }

        System.out.printf("The number in increasing order are: %f, %f, %f%n", num1, num2, num3);
    }
}