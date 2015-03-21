


import java.util.Scanner;

public class Exercise_03_10{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        if(number1 < number2){
            int temp = number1;
            number1 = number1;
            number2 = temp;        
        }

        System.out.print("What is "+ number1 + " - " + number2 + "? ");
        int answer = in.nextInt();

        if(number1 - number2 == answer)
            System.out.println("You are correct!");
        else{
            System.out.println("Your answer is incorrect.");
            System.out.print(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    } 
}