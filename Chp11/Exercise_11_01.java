/*
Design a class named Triangle that extends GeometricObject. The class contains:
 Threedouble data fields named side1,side2, and side3 with default 
 values1.0 to denote three sides of the triangle. 
 A no-arg constructor that creates a default triangle. 
 A constructor that creates a triangle with the specified 
 side1,side2, and side3. 
 The accessor methods for all three data fields. 
 A method named getArea() that returns the area of this triangle. 
 A method named getPerimeter() that returns the perimeter of this triangle. 
 A method named toString() that returns a string description for the triangle.

For the formula to compute the area of a triangle, see Programming Exercise 
2.19.ThetoString() method is implemented as follows:
return"Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3;

Draw the UML diagrams for the classes Triangle and GeometricObject and implement
the classes. Write a test program that prompts the user to enter three sides of
the triangle, a color, and a Boolean value to indicate whether the triangle is filled. 
The program should create a Triangle object with these sides and set thecolor 
and filled properties using the input. The program should display the area, 
perimeter, color, and true or false to indicate whether it is filled or no
*/

public class Exercise_11_01 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        
        System.out.print("Please enter the 3 sides of your triangle: ");
        double s1 = in.nextDouble();
        double s2 = in.nextDouble();
        double s3 = in.nextDouble();
        System.out.print("Please enter the color: ");
        String color = in.next();
        System.out.print("Is the triangle filled (true or false): ");
        boolean filled = in.nextBoolean();
        
        Triangle t = new Triangle(s1, s2, s3);
        t.setColor(color);
        t.setFilled(filled);
        
        System.out.printf("Triangle perimeter: %.2f%n" + 
                          "Triangle area: %.2f%n" +
                          "Triangle color: %s%n" +
                          "Triangle filled? %s%n",
                           t.getPerimeter(), 
                           t.getArea(),
                           t.getColor(),
                           t.isFilled());
        
        
    }
}

