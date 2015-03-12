/********************************
    (Financial application: compound value) Suppose you save $100 each month
    into a savings account with the annual interest rate 5%. Thus, the monthly interest
    rate is 0.05/12 = 0.00417. After the first month, the value in the account
    becomes
    100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a program that prompts the user to enter a monthly saving amount and
    displays the account value after the sixth month. (In Exercise 5.30, you will use a
    loop to simplify the code and display the account value for any month.)

*******************************/

import java.util.Scanner;

public class Exercise_02_13{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = in.nextInt();

        double interestRateMonthly = 0.05/ 12.0;
        double firstMonth = 100 * (1 + 0.00417);
        double secondMonth = (100 + firstMonth) * (1 + 0.00417);
        double thirdMonth = (100 + secondMonth) * (1 + 0.00417);
        double forthMonth = (100 + thirdMonth) * (1 + 0.00417);
        double fifthMonth = (100 + forthMonth) * (1 + 0.00417);
        double sixthMonth = (100 + fifthMonth) * (1 + 0.00417);

        System.out.printf("After the sixth month, the account value is %.2f", sixthMonth);


    }
}