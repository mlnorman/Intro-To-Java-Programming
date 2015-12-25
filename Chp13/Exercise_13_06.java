/*
    Define a class named ComparableCircle
    that extends Circle and implements Comparable. Draw the UML diagram and
    implement the compareTo method to compare the circles on the basis of area.
    Write a test class to find the larger of two instances of ComparableCircle 
    objects.
*/

public class Exercise_13_06 {
    public static void main(String[] args) {
      GeometricObject c1 = new ComparableCircle(3);
      GeometricObject c2 = new ComparableCircle(5.2);

      System.out.println("Biggest circle is: " + GeometricObject.max(c2, c1).toString());
    }
}