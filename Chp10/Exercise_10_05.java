/*
    Write a program that prompts the user to enter
    a positive integer and displays all its smallest factors in decreasing order. For
    example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
    2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
    retrieve and display them in reverse order.
*/
import java.util.Scanner;


public class Exercise_10_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] primes = new int[100];
        //int[] valuesToCheck = new int[100];
        StackOfIntegers soi = new StackOfIntegers();

        System.out.print("Please enter a positive integer: ");
        int userVal = in.nextInt();

        if (isPrime(userVal)){
            System.out.printf("%d is a prime number.", userVal);
        } else {
            getFactors(userVal, soi);
        }

        int size = soi.getSize();
        System.out.printf("The smallest prime factors of %d is ", userVal);
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", soi.pop());
        }
    }

    public static void getFactors(int value, StackOfIntegers soi) {
        int[] values = new int[100];
        values[0] = value;

        int valCount = 1;


        for (int potentialPrime : values) {
            if (isPrime(potentialPrime)) {
                soi.push(potentialPrime);
                break;
            } 

            for (int i = 2; i < potentialPrime; i++) {
                if (potentialPrime % i == 0) {
                    soi.push(i);
                    values[valCount] = potentialPrime / i;
                    break;
                }
            }
            valCount++;
        }
    }



    public static boolean isPrime(int value) {
        if (value == 1 || value == 2) {
            return true;
        } else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0)
                    return false;
            }
        }
        return true;
    }
}


