/**
 * Created by admin on 3/11/2015.
 *
 *  Conver feet to meters.
 */
import java.util.Scanner;

public class Exercise_02_03 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = in.nextDouble();

        System.out.printf("%.2f feet is %.4f meters", feet, feet * 0.305);

    }
}
