/*

    Write a program that prompts the user to enter values for a, b, and c and displays
    the result based on the discriminant. If the discriminant is positive, display two
    roots. If the discriminant is 0, display one root. Otherwise, display The equation
    has no real roots

*/

import java.util.Scanner;

public class Exercise_03_01{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double discriminant = Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5);


        if (discriminant > 0){
            double ans_1 = ((b*(-1)) + Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / (2 * a);
            double ans_2 = ((b*(-1)) - Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / (2 * a);

            System.out.printf("The equation has two roots %.5f and %.5f", ans_1, ans_2);

        }else if(discriminant == 0){
            double ans = ((b*(-1)) + Math.pow((Math.pow(b,2) - 4 * a * c), 0.5)) / (2 * a);
            System.out.println("The equation has one root " + ans);
        }else{
            System.out.println("The equation has no real roots");
        }



    }
}