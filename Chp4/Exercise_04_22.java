/*
    Write a program that prompts the user to enter two strings and
    reports whether the second string is a substring of the first string.
*/

import java.util.Scanner;

public class Exercise_04_22 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter string s1: ");
        String s1 = in.nextLine();
        
        System.out.print("Enter string s2: ");
        String s2 = in.nextLine();
        
        if (s1.indexOf(s2) != -1) {
            System.out.printf("%s is a substring of %s%n", s2, s1);
        }
        else{
            System.out.printf("%s is not a substring of %s%n", s2, s1);
        }
    }
}