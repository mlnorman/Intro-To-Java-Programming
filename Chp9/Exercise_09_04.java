/*
    Write a program that creates a Random object with seed
    1000 and displays the first 50 random integers between 0 and 100 using the
    nextInt(100) method.
*/

public class Exercise_09_02 {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.print(rand.nextInt(100) + " ");
        }
    }
}