/*
    Write the methods with the following headers
    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number)
    // Return true if number is a palindrome
    public static boolean isPalindrome(int number)
    Use the reverse method to implement isPalindrome. A number is a palindrome
    if its reversal is the same as itself. Write a test program that prompts the
    user to enter an integer and reports whether the integer is a palindrome.
*/

import java.util.Scanner;

public class Exercise_06_03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter an integer to reverse: ");
        int number = in.nextInt();

        System.out.printf("%d reversed is %d%n", number, reverse(number));
        System.out.printf("%d is %s palindrone%n",
            number,
            isPalindrone(number) ? "a" : "not a");
    }

    public static int reverse(int number){
        String reversedNumber = "";

        while(number != 0){
            reversedNumber += number % 10;
            number = number / 10;
        }

        return Integer.parseInt(reversedNumber);
    }

    public static boolean isPalindrone(int number){
        if (number == reverse(number))
            return true;
        return false;
    }
}