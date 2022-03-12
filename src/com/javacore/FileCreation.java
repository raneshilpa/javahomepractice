package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    //create a file

    public static void main(String[] args) throws IOException {
        // Creating an object of a file
        //// creates an object of File using the path
        // File file = new File(String pathName);
        //Java File Operation Methods
        //Operation	Method	Package
        //To create file	createNewFile()	java.io.File
        //To read file	read()	java.io.FileReader
        //To write file	write()	java.io.FileWriter
        //To delete file	delete()	java.io.File


        try {
            File f1 = new File("/Users/shilparane/QA_Material/test.txt");
            if (f1.createNewFile()) {
                System.out.println("File" + f1.getName() + "  is created successfully");

            } else {
                System.out.println("File is alreay exist in dirctory");
            }
        }
        catch(IOException e)
        {
            System.out.println("Unexpected error occured");
            e.printStackTrace();
        }

    }
}
