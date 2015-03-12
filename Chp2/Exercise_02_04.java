/***********************
*   Created by mike on 03/11/2015
*
*   convert pounds to kilograms.
*******************/

import java.util.Scanner;

public class Exercise_02_04{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity rate: ");

        double subtotal = in.nextDouble();
        double gratuityRate = in.nextDouble();

        double percentage = gratuityRate / 100.0;

        System.out.printf("The gratuity rate is $%.2f and total is $%.2f \n", subtotal * percentage, subtotal +
         (subtotal * percentage));
    }

}