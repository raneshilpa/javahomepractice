package com.filehandling;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        char[] array = new char[100];

        //File f1 = new File("/Users/shilparane/QA_Material/test.txt");
        // Creates a reader using the FileReader
        try {
            FileReader input = new FileReader("/Users/shilparane/QA_Material/test.txt");
            // read characters
            input.read(array);
            System.out.println("DATA IN THE FILE :");
            System.out.println(array);

            // close the reader
            input.close();



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
