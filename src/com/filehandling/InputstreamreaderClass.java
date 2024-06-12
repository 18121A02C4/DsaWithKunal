package com.filehandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputstreamreaderClass {
    public static void main(String[] args) throws IOException {
        try(InputStreamReader isr=new InputStreamReader(System.in)) {
            System.out.println("Enter the data");
            int letters = isr.read();
            while (isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }

            isr.close();
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
