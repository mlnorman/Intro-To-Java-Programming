/*

An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other nine digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer.

*/

import java.util.Scanner;

public class Exercise_03_09{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the 9 digit ISBN: ");
        int isbn = in.nextInt();

        int digit_9 = isbn % 10;
        int current_length = isbn / 10;
        int digit_8 = current_length % 10;
        current_length = current_length / 10;
        int digit_7 = current_length % 10;
        current_length = current_length / 10;
        int digit_6 = current_length % 10;
        current_length = current_length / 10;
        int digit_5 = current_length % 10;
        current_length = current_length / 10;
        int digit_4 = current_length % 10;
        current_length = current_length / 10;
        int digit_3 = current_length % 10;
        current_length = current_length / 10;
        int digit_2 = current_length % 10;
        current_length = current_length / 10;
        int digit_1 = current_length % 10;
        current_length = current_length / 10;

        int checksum_int = (digit_1 * 1 + digit_2 * 2 + digit_3 * 3 + digit_4 * 4 + digit_5 * 5 + digit_6 * 6 + digit_7 * 7 + digit_8 * 8 + digit_9 * 9) % 11;

        boolean len = isbn < 100000000;

        if(checksum_int == 10){
            if(len)
                System.out.println("The ISBN-10 number is 0" + isbn + "X");
            else
                System.out.println("The ISBN-10 number is " + isbn + "X");

        }else{
            if(len)
                System.out.println("The ISBN-10 number is 0" + isbn + checksum_int);
            else
                System.out.println("The ISBN-10 number is " + isbn + checksum_int);
        }
    }
}