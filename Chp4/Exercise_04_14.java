/*
    Write a program that prompts the user to enter a
    letter grade A, B, C, D, or F and displays its 
    corresponding numeric value 4, 3, 2, 1, or 0.
*/

import java.util.Scanner;

public class Exercise_04_14{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a letter grade: ");
        char grade = in.nextLine().charAt(0);
        int val = 0;
        
        switch(Character.toUpperCase(grade))
        {
            case 'A':
                val = 4;
                break;
            case 'B':
                val = 3;
                break;
            case 'C':
                val = 2;
                break;
            case 'D':
                val = 1;
                break;
            case 'F':
                val = 0;
                break;
            default:
                System.out.println(grade + " is an invalid grade");
                break;
        }
    
        System.out.printf("The numeric value for grade %s is %d%n", Character.toUpperCase(grade), val);
        
    }
 
}