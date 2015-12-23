/*
    Write a program that converts the Java source
    code from the next-line brace style to the end-of-line brace style. 

    Your program can be invoked from the command line with the Java sourcecode
    file as the argument. It converts the Java source code to a new format. For
    example, the following command converts the Java source-code file Test.java
    to the end-of-line brace style.
*/
import java.util.Scanner;
import java.io.*;

public class Exercise_12_12 {
    public static void main (String [] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Use: java Exercise_12_12 Test.java");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.printf("%s does not exist.%n", args[0]);
            System.exit(2);
        }

        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(file);

        while(in.hasNext()) {
            String line = in.nextLine();
            System.out.println(line);
            if ((line.trim()).isEmpty()) {
                sb.append("\r\n");
                continue;
            }
            if ((line.trim()).charAt(0) == '{') {
                sb.append(" {");
                if ((line.trim()).length() > 1) {
                    sb.append("\r\n" + line.replace('{', ' '));
                }
            }
            else {
                sb.append("\r\n" + line);
            }
            System.out.println(line);
        }
        in.close();

        PrintWriter pw = new PrintWriter(file);
        pw.print(sb.toString());
        pw.close();
    }
}