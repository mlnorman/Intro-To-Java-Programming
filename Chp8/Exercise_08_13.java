/*
    Write the following method that returns the location
    of the largest element in a two-dimensional array.
    public static int[] locateLargest(double[][] a)
    The return value is a one-dimensional array that contains two elements. These
    two elements indicate the row and column indices of the largest element in the
    two-dimensional array. Write a test program that prompts the user to enter a twodimensional
    array and displays the location of the largest element in the array.
*/
import java.util.Scanner;

public class Exercise_08_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = in.nextInt();
        int columns = in.nextInt();
        double[][] userArray = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < userArray.length; i++) {
            for (int j = 0; j < userArray[i].length; j++) {
                userArray[i][j] = in.nextDouble();
            }
        }

        int[] location = locateLargest(userArray);
        System.out.printf("The location of the largest element is (%d, %d)%n",
            location[0], location[1]);
    }

    public static int[] locateLargest(double[][] a) {
        int[] location = new int[]{0, 0};
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (largest < a[i][j]) {
                    largest = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }


}