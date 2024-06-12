package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterClass {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\note.txt")){
            fw.write("while writing data into a file closing that file is important");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
