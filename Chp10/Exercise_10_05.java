/*
    Write a program that prompts the user to enter
    a positive integer and displays all its smallest factors in decreasing order. For
    example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
    2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
    retrieve and display them in reverse order.
*/
import java.util.Scanner;
public class Execise_10_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        int userVal = in.nextInt();

        if (isPrime(userValue)){
            System.out.printf("The lowest prime factors of %d is: %d, %d",
                userVal, 1, userVal);
        } else {
            public getFactors(userValue);
        }

    }

    public static int[] getFactors(int value) {
        int[] prime = prime[100];
        int[] notPrime = prime[1];

        /*Work i progress*/


        return prime;
    }



    public static isPrime(int value) {
        if (value == 1 || value == 2) {
            return true
        } else {
            for (int i = 2; i < value; i++) {
                if (value % 2 == 0)
                    return false;
            }
        }
        return true;
    }
}
