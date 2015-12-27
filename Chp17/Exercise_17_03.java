/*
  Suppose a binary data file named
  Exercise17_03.dat has been created and its data are created using
  writeInt(int) in DataOutputStream. The file contains an unspecified
  number of integers. Write a program to find the sum of the integers.
*/

import java.io.*;

public class Exercise_17_03 {
  public static void main(String[] args) {
    int sum = 0;

    try(
      DataInputStream dis = new DataInputStream(new FileInputStream("Exercise17_02.txt"));
    ) {
      while (true) {
        sum += dis.readInt();
      }
    }
    catch (EOFException eof) {
      System.out.println("File reading complete.");
    }
    catch (IOException ioe) {
      ioe.printStackTrace();
    }

    System.out.println("The sum of the values in the file is: " + sum);
  }
}