package com.dillon;

import java.io.*;

/**
 * This class reads data from a file and and opens a new input and output stream if the file is found.
 */

public class FileInput {


    FileInputStream in = null;
    FileOutputStream out = null;

    /**
     *
     *
     * @param fileName taks the name of a file
     */
    public FileHandler(String fileName) {

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}