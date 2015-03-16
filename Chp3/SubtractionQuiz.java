/*

1. Generate two single-digit integers into number1 and number2.
2. If number1 < number2, swap number1 with number2.
3. Prompt the student to answer, "What is number1 – number2?"
4. Check the student’s answer and display whether the answer is correct.


*/
import java.util.Scanner;

public class SubtractionQuiz{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if(number1 < number2){
            int temp = number1;
            number1 = number1;
            number2 = temp;        
        }

        System.out.print("What is "+ number1 + " - " + number2 + "?");
        int answer = in.nextInt();

        if(number1 - number2 == answer)
            System.out.println("You are correct!");
        else{
            System.out.println("Your answer is incorrect.");
            System.out.print(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    } 
}