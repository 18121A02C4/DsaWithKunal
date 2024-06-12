package com.filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderClass {
    public static void main(String[] args) {
//        BufferedReader br=new BufferedReader(new FileReader("notes.txt));
            try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
                System.out.println("You Typed:"+ br.readLine());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
    }
}
