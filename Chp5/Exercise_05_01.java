/*
    Write a program that reads an unspecified number of integers, determines how many
    positive and negative values have been read, and computes the total and average of
    the input values (not counting zeros). Your program ends with the input 0. Display
    the average as a floating-point number.
*/

import java.util.Scanner;

public class Exercise_05_01{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a series of integers seperated by a space (ex. 1 2 -5 3 0), the input ends if it is 0: ");
        int val = in.nextInt();
        double total = 0;
        int numOfPos = 0;
        int numOfNeg = 0;
        double avg = 0;
        int count = 0;

        while (val != 0){
            total += val;
            
            if (val > 0)
                numOfPos += 1;
            else
                numOfNeg += 1;

            count += 1;

            val = in.nextInt();
        }

        avg = total / (double) count;
        
        System.out.printf("The number of positives is %d%nThe number of negatives is %d%n" + 
            "The total is %.2f%nThe average is %.2f%n", numOfPos, numOfNeg, total, avg);
    }
}