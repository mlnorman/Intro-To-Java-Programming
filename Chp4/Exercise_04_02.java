/*
(Geometry: great circle distance) The great circle distance is the distance between
two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
latitude and longitude of two points. The great circle distance between the two
points can be computed using the following formula:
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees. Here is a sample run:
*/

import java.util.Scanner;

public class Exercise_04_02{

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter point 1 (latitude and longitude) in degrees: ");
        double point_1_latitude = in.nextDouble();
        double point_1_longitude = in.nextDouble();
        System.out.printf("Enter point 2 (latitude and longitude) in degrees: ");
        double point_2_latitude = in.nextDouble();
        double point_2_longitude = in.nextDouble();

        double d = 6371.01 * Math.acos((
            Math.sin(Math.toRadians(point_1_latitude)) *
            Math.sin(Math.toRadians(point_1_longitude))) +
            (Math.cos(Math.toRadians(point_1_latitude)) * 
            Math.cos(Math.toRadians(point_1_longitude)) * 
            Math.cos(Math.toRadians(point_2_longitude) - Math.toRadians(point_2_latitude))));
    
        System.out.printf("The distance between the two points is %f km.", d);    
    }
    
}
