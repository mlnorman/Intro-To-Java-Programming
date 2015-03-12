/**
 * Created by mike on 2/19/2015.
 *
 *  Convert Celcius to Fahrenheit
 */

import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        
        double celsius = input.nextDouble();
        double farhenheit = (9.0/5.0) * celsius + 32;
        
        System.out.println(celsius + " Celsius is " + farhenheit + " Farhenheit");
    }
}
