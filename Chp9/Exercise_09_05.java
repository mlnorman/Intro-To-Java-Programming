/*
    Java API has the GregorianCalendar class
    in the java.util package, which you can use to obtain the year, month, and day of a
    date. The no-arg constructor constructs an instance for the current date, and the methods
    get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
    and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
    Write a program to perform two tasks:
      Display the current year, month, and day.
      The GregorianCalendar class has the setTimeInMillis(long), which
    can be used to set a specified elapsed time since January 1, 1970. Set the value
    to 1234567898765L and display the year, month, and day.
*/
import java.util.*;

public class Exercise_09_05 {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.printf("Today is  %d/%d/%d%n",
            c.get(GregorianCalendar.MONTH) + 1,
            c.get(GregorianCalendar.DAY_OF_MONTH),
            c.get(GregorianCalendar.YEAR));
    
        c.setTimeInMillis(1234567898765L);
        System.out.printf("After setting time:  %d/%d/%d",
            c.get(GregorianCalendar.MONTH) + 1,
            c.get(GregorianCalendar.DAY_OF_MONTH),
            c.get(GregorianCalendar.YEAR));
        
    }
}