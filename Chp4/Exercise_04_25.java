/*
    Assume a vehicle plate number consists of three
    uppercase letters followed by four digits. Write a program to generate a plate
    number.
*/

public class Exercise_04_25{
    public static void main(String[] args){
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        int num3 = (int)(Math.random() * 10);
        int num4 = (int)(Math.random() * 10);
        
        int char1 = (int) (Math.random() * 10);    
        int char2 = (int) (Math.random() * 10);    
        int char3 = (int) (Math.random() * 10);    

        System.out.printf("%s%s%s%d%d%d%d%n", 
            alphabet.charAt(char1),
            alphabet.charAt(char2),
            alphabet.charAt(char3),
            num1,
            num2,
            num3,
            num4);

    }
}