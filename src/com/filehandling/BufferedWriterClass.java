package com.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) {
        try(BufferedWriter bfw=new BufferedWriter(new FileWriter("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\note.txt"))){
            bfw.write("Hare Krishna");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
