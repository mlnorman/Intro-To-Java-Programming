/**
 *   Created by admin on 2/19/2015.
 *   Write a program that reads in the radius
 *   and length of a cylinder and computes the area and volume using the following
 *   formulas
 */

import java.util.Scanner;

public class Exercise_02_02 {

    public static void main(String[] args) {
        final double PI = 3.1459;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        String input = in.nextLine();

        String[] split = input.split(" ");

        System.out.println(split[1]);
        double radius = Double.parseDouble(split[0]);
        double length = Double.parseDouble(split[1]);

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}
