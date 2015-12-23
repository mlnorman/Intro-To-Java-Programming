/*
    Write a program that will count
    the number of characters, words, and lines in a file. Words are separated by
    whitespace characters. The file name should be passed as a command-line
    argument, as shown in Figure 12.13.
*/

import java.util.Scanner;
import java.io.File;

public class Exercise_12_13 {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Use: java Exercise_12_13 Loan.java");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("please include the source file");
            System.exit(2);
        }
    
        Scanner in = new Scanner(file);
        long charCount = 0L;
        int lines = 0;
        int words = 0;

        while(in.hasNext()) {
            String line = in.nextLine();
            
            String[] wordArray = line.split(" ");         

            charCount += line.length();
            lines += 1;
            words += wordArray.length;
        }
        System.out.printf("File %s has%n" +
                "%d characters%n" + 
                "%d words%n" +
                "%d lines%n%n",
                args[0], charCount, words, lines);
    }
}