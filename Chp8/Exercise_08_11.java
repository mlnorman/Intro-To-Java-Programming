/*
    Nine coins are placed in a 3-by-3 matrix with some
    face up and some face down. You can represent the state of the coins using a
    3-by-3 matrix with values 0 (heads) and 1 (tails).
    Each state can also be represented using a binary number
    There are a total of 512 possibilities, so you can use decimal numbers 
    0, 1, 2, 3, ... and 511 to represent all states of the matrix. Write a program that prompts
    the user to enter a number between 0 and 511 and displays the corresponding
    matrix with the characters H and T.
*/
import java.util.Scanner;

public class Exercise_08_11 {
    /*
        Not happy with this solution, but it works...        
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] binaryArray = new char[9];
        for (int i = 0; i < binaryArray.length; i++)
            binaryArray[i] = '0';

        System.out.print("Enter an integer between 0 and 511: ");
        char[] userBinaryCharArray = (Integer.toBinaryString(in.nextInt())).toCharArray();

        for (int i = 0; i < userBinaryCharArray.length; i++) {
            binaryArray[binaryArray.length - i - 1] = userBinaryCharArray[i]; 
        }

        for (int j = 0; j < binaryArray.length; j++) {
            if (j % 3 == 0) System.out.println();
            System.out.printf("%s ", binaryArray[j] == '0' ? 'H' : 'T');
        }
    }
}