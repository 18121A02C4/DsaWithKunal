package com.filehandling;

import java.io.*;

public class FileClass {
    public static void main(String[] args) {
        try{
            File f=new File("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\new_file.txt");
            f.createNewFile();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //writing the file
        try{
            FileWriter fw=new FileWriter("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\new_file.txt");
            fw.write("कर्मण्येवाधिकारस्ते मा फलेषु कदाचन।");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }

        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\new_file.txt"))){
            System.out.println("You Typed:"+ br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
