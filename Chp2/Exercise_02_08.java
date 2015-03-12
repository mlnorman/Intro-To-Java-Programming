/*
*
*   (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
*   the current time in GMT. Revise the program so that it prompts the user to enter
*   the time zone offset to GMT and displays the time in the specified time zone.
*/

import java.util.Scanner;

public class Exercise_02_08{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the timezone offset to GMT: ");

        long offset = in.nextInt();

        long currentTimeInMilliseconds = System.currentTimeMillis();

        long totalSeconds = currentTimeInMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + offset) % 24;

        System.out.printf("The current time is %d:%d:%d\n", currentHour, currentMinute, currentSecond);


    }
}