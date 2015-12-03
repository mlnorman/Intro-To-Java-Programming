/*
    Write two overloaded methods that return the average of an
    array with the following headers:
    public static int average(int[] array)
    public static double average(double[] array)
    Write a test program that prompts the user to enter ten double values, invokes this
    method, and displays the average value.
*/

public class Exercise_07_08 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        double[] vals = new double[10];
        System.out.print("Please enter to double values: ");

        for (int i = 0; i < 10; i++) 
            vals[i] = in.nextDouble();
    
        System.out.printf("The average is: %.2f", average(vals));
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array) 
            sum += val;
        return sum / array.length;
    }
}