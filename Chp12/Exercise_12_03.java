/*
    Write a program that meets the following requirements:
     Creates an array with 100 randomly chosen integers.
     Prompts the user to enter the index of the array, then displays 
     the corre-sponding element value. If the specified index is out of bounds,
     display the messageOut of Bounds
*/

public class Exercise_12_03 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int[] randomInts = new int[100];
        
        for (int i = 0; i < 100; i++) {
            randomInts[i] = (int)(Math.random() * 101);
        }
        int arrayLength = randomInts.length;
        int val = 0;
        int valAtIndex = 0;
        
        System.out.print("Enter the index of the value you would like to see: ");
        try{
            val = in.nextInt();
            valAtIndex = randomInts[val - 1];
            System.out.printf("The value at postition %d is %d%n", 
            val,
            valAtIndex);
        }
        catch (java.util.InputMismatchException ime) {
            System.out.println("You must enter an integer!");
        }
        catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("You must enter an integer between 1 and 100.");
       
        }
        
    
    }
}