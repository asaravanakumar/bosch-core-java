package com.examples.java.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class ReadFileDataWithScannerEx {
    public static void main(String[] args) throws IOException {
 
//        Scanner s = null;
 
        try(Scanner s  = new Scanner(new FileReader("./output/output.txt"));) {

            
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        }

//        finally {
//            if (s != null) {
//                s.close();
//            }
//        }
    }
}
