package com.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.*;
public class kunal {
    public static void main(String[] args) throws IOException {
        System.out.println("शशांक");
        FileReader in = new FileReader(
                "C:\\Users\\shash\\OneDrive\\Desktop\\filehandlingjava\\com.com.filehandling.kunal\\text.txt");
//        FileInputStream in = new FileInputStream(
//                "C:\\Users\\shash\\OneDrive\\Desktop\\filehandlingjava\\com.com.filehandling.kunal\\text.txt");
        int c;
        String ans="";
        while ((c = in.read()) != -1) {
//            Writer writer = new OutputStreamWriter(System.out);
//            writer.write(c); // Correctly writes the Unicode character
//            writer.flush();
           ans+=(char)c;

            // System.out.println(c);
        }
        System.out.println(ans);

    }
}
