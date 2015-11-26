/*
     Write a program that displays the follow-ing table
     (note that 1 kilogram is 2.2 pounds)
*/

public class Exercise_05_03{
    public static void main(String[] args){
        System.out.printf("%-12s %10s%n", "Kilograms", "Pounds");
        for (int i = 1; i < 200; i += 2){
            System.out.printf("%-12d %10.1f%n", i, i * 2.2);
        }
    }
}