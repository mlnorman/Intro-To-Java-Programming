/*
    Use a while loop to find the smallest
    integer n such that n2 is greater than 12,000.
*/

public class Exercise_05_12{
    public static void main(String[] args){
        int n = 1;
        while(n*n <= 12000)
        {
            n += 1;
        }

        System.out.printf("%d^2 is the smallest integer greater than 12,000", n);
    }
}