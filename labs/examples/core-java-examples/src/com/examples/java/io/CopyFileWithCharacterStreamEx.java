package com.examples.java.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyFileWithCharacterStreamEx {

   public static void main(String args[]) throws IOException {

      // try with resources
      try(FileReader in = new FileReader("./input/input.txt");
          FileWriter out = new FileWriter("./output/output.txt");) {
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
            System.out.println((char)c);
         }
         
         System.out.println("File copied successfully.");
         
      } catch (FileNotFoundException e) {
         // throw new CustomException("Error occured - file not found - " + e.getMessage());
         System.out.println("Error occured - file not found - " + e.getMessage());
         e.printStackTrace();
      }
      // try-with resources will auto close the File streams. No need of finally block.
//      finally {
//         if (in != null) {
//            in.close();
//         }
//         if (out != null) {
//            out.close();
//         }
//      }
   }
}