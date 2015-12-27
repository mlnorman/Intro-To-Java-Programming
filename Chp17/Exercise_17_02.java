/*
  Write a program to create a file named
  Exercise17_02.dat if it does not exist. Append new data to it if it already exists.
  Write 100 integers created randomly into the file using binary I/O.
*/

import java.io.*;

public class Exercise_17_02 {
  public static void main(String[] args) {

    try (
      DataOutputStream dos = new DataOutputStream(new FileOutputStream("Exercise17_02.txt", true));
    ) {

      for (int i = 0; i < 100; i++) {
        dos.writeInt((int)(Math.random() * 10000));
      }
    } 
    catch (IOException ioe) {
      ioe.printStackTrace();
    } 
  }
}

