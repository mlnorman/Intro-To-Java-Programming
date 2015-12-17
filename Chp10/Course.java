public class Course {
    private String courseName;
    private String[] students;;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[1];
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length + 1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int count = 0;
        String[] temp = new String[--numberOfStudents];
        for (String s : students) {
            if (s.equals(student)) {
                continue;
            } 
            temp[count] = s;
            count++;
        }
        students = temp;
    }

    public void clear() {
        String[] temp = new String[1];
        students = temp;
        numberOfStudents = 0;
    }
}