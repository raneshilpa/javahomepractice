package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
    public static void main(String[] args) throws IOException {
        String data ="This is appended line1111.";
        // Creates a Writer using FileWriter
        FileWriter wr = new FileWriter("/Users/shilparane/QA_Material/test.txt");

        // Writes string to the file
        wr.append(data);
        System.out.println("Data is written to the file");
        // Closes the writer
        wr.close();

    }
}
