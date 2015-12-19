/*
    Find the first ten numbers with 50 decimal digits that are
    divisible by 2 or 3.
*/
import java.math.BigInteger;

public class Exercise_10_16 {
    public static void main(String[] args) {
        BigInteger bi = new BigInteger(
            "10000000000000000000000000000000000000000000000000");
        bi.add(BigInteger.ONE);
        
        int count = 0;
        while(count < 10) {
            if (bi.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
                    bi.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(bi);
                count++;
            }
            bi = bi.add(BigInteger.ONE);
        }
    }
}