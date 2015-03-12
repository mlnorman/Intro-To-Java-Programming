/*******************************

Science: calculating energy) Write a program that calculates the energy needed
to heat water from an initial temperature to a final temperature. Your program
should prompt the user to enter the amount of water in kilograms and the initial
and final temperatures of the water. The formula to compute the energy is
Q = M * (finalTemperature – initialTemperature) * 4184
where M is the weight of water in kilograms, temperatures are in degrees Celsius,
and energy Q is measured in joules.

***********************************/

import java.util.Scanner;

public class Exercise_02_10{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double water = in.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initTemp = in.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemp = in.nextDouble();

        double q = water * (finalTemp - initTemp) * 4184;

        System.out.println("The energy needed is " + q);
    }

}