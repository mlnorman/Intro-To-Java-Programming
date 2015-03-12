/*************************************

    (Physics: acceleration) Average acceleration is defined as the change of velocity
    divided by the time taken to make the change, as shown in the following formula:
    a =
    v1 - v0
    t
    Write a program that prompts the user to enter the starting velocity v0 in meters/
    second, the ending velocity v1 in meters/second, and the time span t in seconds,
    and displays the average acceleration.


*********************************/        

import java.util.Scanner;

public class Exercise_02_09{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter v0, v1 and t: ");

        double v0 = in.nextDouble();
        double v1 = in.nextDouble();
        double t = in.nextDouble();

        double acceleration = (v1 - v0) / t;

        System.out.printf("The average acceleration is %.4f", acceleration); 
    }
}