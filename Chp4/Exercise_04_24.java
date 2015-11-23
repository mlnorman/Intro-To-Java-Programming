
/*
    Write a program that prompts the user to enter three cities and
    displays them in ascending order.
*/

import java.util.Scanner;

public class Exercise_04_24{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstCity = in.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = in.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = in.nextLine();

        if (firstCity.toUpperCase().compareTo(secondCity.toUpperCase()) > 0){
            String temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }

        if (secondCity.toUpperCase().compareTo(thirdCity.toUpperCase()) > 0){
            String temp = secondCity;
            secondCity = thirdCity;
            thirdCity = temp;
        }

        if (firstCity.toUpperCase().compareTo(secondCity.toUpperCase()) > 0){
            String temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }

        System.out.printf("The cities in alphabetical order are %s, %s, %s%n",
            firstCity, secondCity, thirdCity);
    }
}
