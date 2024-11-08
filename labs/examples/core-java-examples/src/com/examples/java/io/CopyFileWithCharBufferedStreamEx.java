package com.examples.java.io;

import java.io.*;
public class CopyFileWithCharBufferedStreamEx {

   public static void main(String args[]) throws IOException {

      try(BufferedReader in = new BufferedReader(new FileReader("./input/input.txt"));
          PrintWriter out = new PrintWriter(new FileWriter("./output/output.txt"));){

         String line = null;         
         while ((line = in.readLine()) != null) {
        	System.out.println(line);
            out.write(line);
            out.write("\n");
         }
         
         out.flush();
         System.out.println("\n" + "File copied successfully.");
         
      } catch (FileNotFoundException e) {
         // throw new CustomException("Error occured - file not found - " + e.getMessage());
         System.out.println("Error occured - file not found - " + e.getMessage());
         e.printStackTrace();
      }
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