/*
    Write a program that prompts the user to enter two
    characters and displays the major and status represented in the characters. The first
    character indicates the major and the second is number character 1, 2, 3, 4, which
    indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
    the following chracters are used to denote the majors:
    M: Mathematics
    C: Computer Science
    I: Information Technology
*/

import java.util.Scanner;

public class Exercise_04_18{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter two characters: ");
        String status = in.next();
        
        char major = Character.toUpperCase(status.charAt(0));
        char year = status.charAt(1);
        
        String courseName = "";
        String yearName = "";
        
        if (major == 'M' || major == 'I' || major == 'C')
        {
            switch(major)
            {
                case 'M':
                    courseName = "Mathematics";
                    break;
                case 'C':
                    courseName = "Computer Science";
                    break;
                case 'I':
                    courseName = "Information Technology";
                    break;
                default:
                    break;
            }
            
            switch(year)
            {
                case '1':
                    yearName = "Freshman";
                    break;
                case '2':
                    yearName = "Sophmore";
                    break;
                case '3':
                    yearName = "Junior";
                    break;
                case '4':
                    yearName = "Senior";
                    break;
                default:
                    break;
            }
            System.out.printf("%s %s%n", courseName, yearName);
        }
        else{
            System.out.printf("Invalid input.%n");
        }
    }
}