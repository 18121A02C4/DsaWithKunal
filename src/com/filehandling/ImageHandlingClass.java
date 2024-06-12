package com.filehandling;

import java.io.*;

public class ImageHandlingClass {
    public static void main(String[] args) throws IOException {
//        try{
//            FileInputStream fis=new FileInputStream("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\photo.jpg");
//            FileOutputStream fos=new FileOutputStream("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\new_photo.jpg");
//            int read;
//            while((read=fis.read())!=-1){
//                fos.write(read);
//            }
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Image copied successfully");
//        try{
//            BufferedInputStream fis=new BufferedInputStream(new FileInputStream("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\Shashank.jpg"));
//            BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\shash\\intellijideaworkspace\\PractiseDsa\\src\\com\\filehandling\\new_Shashank.jpg"));
//            int read;
//            while((read=fis.read())!=-1){
//                fos.write(read);
//            }
//        }catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Image copied successfully");



        try{
            BufferedInputStream fis=new BufferedInputStream(System.in);
            System.out.println("enter the data");
            BufferedOutputStream fos=new BufferedOutputStream(System.out);
            int read;
            while((read=fis.read())!=-1){
                fos.write(read);
                fos.flush();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Image copied successfully");

    }
}
