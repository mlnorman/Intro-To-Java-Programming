/*
    Write a program that removes all the occurrences of a specified
    string from a text file. For example, invoking
    java Exercise12_11 John filename
    removes the string John from the specified file. Your program should get the
    arguments from the command line.
*/

import java.util.Scanner;

public class Exercise_12_11 {
    public static void main(String[] args) {
        String removalString = args[0];
        String filename = args[1];
        StringBuffer sb = new StringBuffer();

        try(
            Scanner in = new Scanner(new java.io.File(filename));
        ) {
            while(in.hasNext()) {
                String line = in.nextLine();
                if (line.indexOf(removalString) != -1) {
                    line.replace(removalString, "");
                    sb.append(line.replace(removalString, ""));
                }else {
                    sb.append(line);
                }
            }
            System.out.println(sb.toString());

        }
        catch (java.io.FileNotFoundException fnfe) {
            System.out.println("File not found.");
        }

    }
}