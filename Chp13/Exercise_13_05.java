/*
    Modify the GeometricObject class
    to implement the Comparable interface, and define a static max method in the
    GeometricObject class for finding the larger of two GeometricObject objects.
    Write a test program that uses the max method to find the larger of two 
    circles and the larger of two rectangles.
*/

public class Exercise_13_05 {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(4);
        GeometricObject c2 = new Circle(5.3);
        
        GeometricObject largest = (Circle) GeometricObject.max(c1, c2);

        System.out.println("The larger circle is: " +
            largest.toString());
    }
}