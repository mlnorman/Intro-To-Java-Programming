/*
    Revise the Course class as follows:
     The array size is fixed in Listing 10.6. Improve it to automatically increase
     the array size by creating a new larger array and copying the contents of the
     current array to it.
     Implement the dropStudent method.
     Add a new method named clear() that removes all students from the
     course.
     Write a test program that creates a course, adds three students, removes one,
     and displays the students in the course.
*/

public class Exercise_10_09 {
    public static void main(String[] args) {
        Course course = new Course("Intro to Java!");

        course.addStudent("Mike Norman");
        course.addStudent("Tom Jones");
        course.addStudent("Rico Suave");
        course.dropStudent("Mike Norman");

        String[] students = course.getStudents();
        System.out.printf("Number of students in %s: %d%n", 
                         course.getCourseName(), 
                         course.getNumberOfStudents());

        for (String student : students) {
            System.out.printf("%s ", student);
        }
        System.out.println();
    }
}