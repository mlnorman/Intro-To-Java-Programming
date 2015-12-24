/*
    Design a new Triangle class that extends the abstract GeometricObject class
    implement the Triangle class. Write a test program that prompts the user to
    enter three sides of the triangle, a color, and a Boolean value to indicate 
    whether the triangle is filled. The program should create a Triangle object 
    with these sides and set the color and filled properties using the input. 
    The program should display the area, perimeter, color, and true or false to 
    indicate whether it is filled or not
*/
import java.util.Scanner;

public class Exercise_13_01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter 3 sides of a triangle, color and " +
                        "whether it is filled or not (true false): ");
        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double s3 = in.nextDouble();
        String color = in.next();
        boolean filled = in.nextBoolean();
        
        Triangle t1 = null;
        
        try {
            t1 = new Triangle(s1, s2, s3, color, filled);
        }
        catch (IllegalTriangleException ite) {
            System.out.println(ite.toString());
        }
        
        System.out.println(t1.toString());
        System.out.printf("Triangle color: %s, Triangle filled: %s%n" + 
                        "Area: %.2f%n" + 
                        "Perimeter: %.2f%n%n",
                    t1.getColor(), 
                    t1.isFilled(),
                    t1.getArea(),
                    t1.getPerimeter());
            
        
    }
}