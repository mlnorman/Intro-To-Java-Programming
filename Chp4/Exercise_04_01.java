import java.util.Scanner;

public class Exercise_04_01{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.printf("Enter the lengh from the center to a vertec of a pentagon (integer): ");
    double radius = in.nextDouble();

    double s = 2 * radius *Math.sin(Math.PI / 5);

    double area =   (5 * (s * s)) / (4 * Math.tan(Math.PI / 5));

    System.out.printf("%.2  f", area);

  }
}