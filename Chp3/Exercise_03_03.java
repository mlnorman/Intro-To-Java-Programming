/*

    A linear equation can be solved using
    Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
    the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
    that The equation has no solution.

*/

import java.util.Scanner;

public class Exercise_03_03{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double d = in.nextDouble();
        double e = in.nextDouble();
        double f = in.nextDouble();

        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }else{
            double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

            System.out.printf("x is %.1f and y id %.1f", x, y);
        }

    }
}

