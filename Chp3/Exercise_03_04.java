/*

    Write a program that randomly generates an integer between 1
    and 12 and displays the English month name January, February ..., December for
    the number 1, 2, 12 accordingly.
*/

import java.util.Random;

public class Exercise_03_04{
    public static void main(String[] args){

        Random rand = new Random();

        int random_month = rand.nextInt(12) + 1;

        switch(random_month){
            case 1: System.out.println("January");
                    break;
            case 2: System.out.println("February");
                    break;
            case 3: System.out.println("March");
                    break;
            case 4: System.out.println("April");
                    break;
            case 5: System.out.println("May");
                    break;
            case 6: System.out.println("June");
                    break;
            case 8: System.out.println("August");
                    break;
            case 9: System.out.println("September");
                    break;
            case 10: System.out.println("October");
                    break;
            case 11: System.out.println("November");
                    break;
            case 12: System.out.println("December");
                    break;

        }

    }
}