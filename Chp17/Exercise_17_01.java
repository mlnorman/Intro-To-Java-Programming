/*
  Write a program to create a file named Exercise17_01.txt if
  it does not exist. Append new data to it if it already exists. Write 100 integers
  created randomly into the file using text I/O. Integers are separated by a space.
*/

import java.io.*;
import java.util.Scanner;

public class Exercise_17_01 {
  public static void main(String[] args) {

    try (
      PrintWriter pw = new PrintWriter(new FileOutputStream(new File("Exercise17-01.txt"), true));
    ) {
      for (int i = 0; i < 100; i++) {
        pw.print((int)(Math.random() * 100) + " ");
      }
    } 
    catch (FileNotFoundException fnfe) {
      System.out.println("Cannot create the file.");
      fnfe.printStackTrace();
    }
  }
}