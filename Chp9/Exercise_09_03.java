/*
    Write a program that creates a Date object, sets its elapsed
    time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
    10000000000, and 100000000000, and displays the date and time using the
    toString() method, respectively
*/
public class Exercise_09_01 {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        //date.setTime(10000);
        long[] times = new long[] {
            10000, 100000, 1000000, 10000000, 100000000, 1000000000,
            10000000000L, 100000000000L
        };

        for (int i = 0; i < times.length; i++) {
            date.setTime(times[i]);
            System.out.println(date.toString());
        }

    }
}