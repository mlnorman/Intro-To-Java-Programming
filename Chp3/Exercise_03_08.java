/*

    Write a program that prompts the user to enter three integers
    and display the integers in non-decreasing order.

*/

import java.util.Scanner;

public class Exercise_03_08{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 3 integers seperated by a space: ");
        int int_1 = in.nextInt();
        int int_2 = in.nextInt();
        int int_3 = in.nextInt();

        if(int_1 < int_2 && int_1 < int_3 && int_2 < int_3){
            System.out.println("Decreasing order: " + int_1 + " " + int_2 + " " + int_3);
        }else if(int_2 < int_1 && int_3 < int_2){
            System.out.println("Decreasing order: " + int_3 + " " + int_2 + " " + int_1);
        }else if(int_2 > int_1 && int_2 > int_3 && int_1 < int_3){
            System.out.println("Decreasing order: " + int_1 + " " + int_3 + " " + int_2);
        }else if(int_2 > int_1 && int_2 > int_3 && int_3 < int_1){
            System.out.println("Decreasing order: " + int_2 + " " + int_1 + " " + int_3);
        }else if(int_2 > int_1 && int_2 > int_3 && int_3 > int_1){
            System.out.println("Decreasing order: " + int_2 + " " + int_3 + " " + int_1);
        }else{
            System.out.println("Decreasing order: " + int_3 + " " + int_1 + " " + int_2);       
        }

    }
}