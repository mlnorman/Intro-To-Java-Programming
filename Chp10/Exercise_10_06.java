/*
    Write a program that displays all the prime
    numbers less than 120 in decreasing order. Use the StackOfIntegers class
    to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
    reverse order.
*/

public class Exercise_10_06 {
    public static void main(String[] args) {
        StackOfIntegers soi = new StackOfIntegers();

        for (int i = 2; i < 120; i++) {
            if (isPrime(i))
                soi.push(i);
        }
        
        int size = soi.getSize();
        System.out.println("Prime numbers less than 120 are:");
        for (int j = 0; j < size; j++) {
            System.out.printf("%d%s ", soi.pop(), j < size - 1 ? "," : "");
        }
    }

    public static boolean isPrime(int value) {
        if (value == 1 || value == 2) {
            return true;
        } else {
            for (int i = 2; i < value; i++) {
                if (value % i == 0)
                    return false;
            }
        }
        return true;
    }
}