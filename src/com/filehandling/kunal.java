package com.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.*;
public class kunal {
    public static void main(String[] args) throws IOException {
        System.out.println("शशांक");
        FileReader in = new FileReader(
                "C:\\\\Users\\\\shash\\\\intellijideaworkspace\\\\PractiseDsa\\\\src\\\\com\\\\filehandling\\\\text.txt");
//        FileInputStream in = new FileInputStream(
//                "C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\text.txt");
        int c;
        String ans="";
        while ((c = in.read()) != -1) {
//            Writer writer = new OutputStreamWriter(System.out);
//            writer.write(c); // Correctly writes the Unicode character
//            writer.flush();
            System.out.println(c);
           ans+=(char)c;

            // System.out.println(c);
        }
        System.out.println(ans);

    }
}
