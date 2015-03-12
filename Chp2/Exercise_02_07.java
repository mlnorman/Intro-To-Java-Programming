/*
 *   (Find the number of years) Write a program that prompts the user to enter the
 *   minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 *   For simplicity, assume a year has 365 days.
 *
*/

import java.util.Scanner;

public class Exercise_02_07{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");

        int numOfMinutes = in.nextInt();

        int hour = 60;
        int day = 60 * 24;
        int year = day * 365;

        int numOfYears = numOfMinutes / year;
        int numOfDays = (numOfMinutes % year) / day;

        System.out.printf("%d minutes is approximately %d years and %d days.", numOfMinutes, numOfYears, numOfDays);

    }
}