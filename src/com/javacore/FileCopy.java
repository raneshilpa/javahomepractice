package com.filehandling;

import java.io.*;

public class FileCopy {
    // copy file pdf and create a different file in the same location
    public static void main(String[] args) throws IOException {


    }

    public static void copyFile() throws IOException {
        File file = new File("/Users/shilparane/QA_Material/Linux PPT.pdf");
        File outFile = new File("/Users/shilparane/QA_Material/Linux PPT_copy.pdf");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {

            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
