 import java.util.Scanner;

 public class Exercise_02_22{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your amount in without a decimal.  Ex Enter 1100 for $11.00: ");
        int amount = in.nextInt();

        int cents = amount % 100;
        int dollars = amount / 100;

        int remaining = cents;

        int numOfQuarters = remaining / 25;
        remaining = remaining % 25;

        int numOfDimes = remaining / 10;
        remaining = remaining % 10;

        int numOfNickels = remaining / 5;
        remaining = remaining % 5;

        int numOfPennys = remaining / 1;


        System.out.printf("Your amount $%d.%d consists of\n", dollars, cents);
        System.out.println("    " + dollars + " dollars");
        System.out.println("    " + numOfQuarters + " quarters");
        System.out.println("    " + numOfDimes + " dimes");
        System.out.println("    " + numOfNickels + " nickels");
        System.out.println("    " + numOfPennys + " pennys");
    }
 }