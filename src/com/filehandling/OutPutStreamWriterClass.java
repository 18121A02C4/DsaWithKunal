package com.filehandling;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutPutStreamWriterClass {
    public static void main(String[] args) throws IOException {
        OutputStream os=System.out;
        os.write(66);
        System.out.println();
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char [] arr="hello Duniyaa".toCharArray();
            osw.write(arr);

        }catch(IOException e){
            System.out.println(e.getMessage());
        }



    }
}
