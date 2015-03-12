/*
*   Created by mike 03/11/2015
*
*   (Sum the digits in an integer) Write a program that reads an integer between 0 and
*   1000 and adds all the digits in the integer. For example, if an integer is 932, the
*   sum of all its digits is 14.
*
*/

import java.util.Scanner;

public class Exercise_02_06{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");

        int userInput = in.nextInt();

        int firstDigit = userInput % 10; // get last digit
        int firstExtract = userInput / 10; // remove last digit

        int secondDigit = firstExtract % 10;
        int secondExtract = firstExtract / 10;
        
        int thirdDigit = secondExtract % 10;
        int thirdExtract = secondExtract / 10;
        
        int lastDigit = thirdExtract % 10;

        int sum = firstDigit + secondDigit + thirdDigit + lastDigit;

        System.out.printf("The sum of digits is %d", sum);

    }
}