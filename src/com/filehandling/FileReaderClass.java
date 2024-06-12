package com.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderClass {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\note.txt")) {
            System.out.println("Enter the data");
            int letters = fr.read();
            while (letters!=-1) {
                System.out.println((char) letters);
                letters = fr.read();
            }

            fr.close();
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
