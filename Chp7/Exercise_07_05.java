/*
    Write a program that reads in ten numbers and displays
    the number of distinct numbers and the distinct numbers separated by exactly one
    space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
    Read a number and store it to an array if it is new. If the number is already in the
    array, ignore it.) After the input, the array contains the distinct numbers.
*/

import java.util.Scanner;

public class Exercise_07_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] userValues = new int[10];
        
        System.out.print("Enter ten numbers: ");
        int elementIndex = 0;

        // Ugly solution, but it works...

        for (int i = 0; i < 10; i++) {
            boolean inArray = false;
            int val = in.nextInt();
            for (int j = 0; j < 10; j++) {
                if (val == userValues[j])
                    inArray = true;
            }
            if (!inArray) {
                userValues[elementIndex] = val;
                elementIndex += 1;
            }
        }
        System.out.printf("The number of distinct numbers is %d.%n", elementIndex);
        for (int a = 0; a <= elementIndex - 1; a++) {
            System.out.printf("%d ", userValues[a]);
        }
        System.out.println();

    
    }
}