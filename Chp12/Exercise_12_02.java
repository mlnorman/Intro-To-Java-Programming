/*
    Write a program that prompts the user to read two integers and displays their 
    sum. Your program should prompt the user to read the number again if the
    input is incorrect
*/

public class Exercise_12_02 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        while(true) {
            System.out.print("Please enter in 2 integers to get their sum: ");        
            try {
                n1 = in.nextInt();
                n2 = in.nextInt();
                
                break;
            } 
            catch (java.util.InputMismatchException ime) {
               System.out.printf("You must enter 2 integers!%n%n");
               in.nextLine(); 
            }
            
        } 
        System.out.printf("The sum is %d%n", (n1+n2));
    }
}