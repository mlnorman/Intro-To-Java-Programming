/*
    Write a program that prompts the user to enter a string and displays
    its length and its first character.
*/

import java.util.Scanner;

public class Exercise_04_20{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String userInput = in.nextLine();
        
        int inputLength = userInput.length();
        char firstLetter = userInput.charAt(0);
        
        System.out.printf("Your string starts with \"%s\" and is %d characters long.%n",
            firstLetter,
            inputLength);
    }
}