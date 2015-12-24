/*
    Suppose that a text file contains an unspecified number of scores separated by
    blanks. Write a program that prompts the user to enter the file, reads the
    scores from the file, and displays their total and averag
*/

import java.io.*;
import java.util.Scanner;

public class Exercise_12_14 {
    public static void main(String[] args) {
        
        System.out.print("Enter a filename of scores to read: ");
        Scanner console = new Scanner(System.in);
        File file = new File(console.next().trim());
        
        try(
            Scanner in = new Scanner(file);
        ) {
            double sum = 0;
            int count = 0;
            
            while(in.hasNext()) {
                sum += in.nextDouble();
                count++;
            }
            
            System.out.printf("Sum = %.2f, and average = %.2f%n", sum, sum / count);
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found.");   
        }
        
    }
}