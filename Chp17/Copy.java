import java.io.*;

public class Copy {
  public static void main(String[] args) throws IOException{
    if (args.length != 2) {
      System.out.println("Usage: java Copy sourceFile targetFile");
      System.exit(1);
    }

    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
      System.out.println("Sourcefile " + args[0] + " does not exist");
      System.exit(2);
    }

    File targetFile = new File(args[1]);
    if (targetFile.exists()) {
      System.out.println("TargerFile " + args[1] + " already exists");
      System.exit(3);
    }

    try (
      BufferedInputStream input = 
          new BufferedInputStream(new FileInputStream(args[0]));
    
      BufferedOutputStream output = 
          new BufferedOutputStream(new FileOutputStream(args[1]));
    ) {
      int r = 0;
      int numberOfBytesRead = 0;
      while ((r = input.read()) != -1) {
        output.write(r);
        numberOfBytesRead++;
      }
      
      System.out.println(numberOfBytesRead + " bytes copied.");    
    }
  }
}