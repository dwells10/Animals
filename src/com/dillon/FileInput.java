package com.dillon;

/**
 * Created by mgreen14 on 12/26/17.
 */
public class FileInput {

    FileInputStream in = null;
    FileOutputStream out = null;


    public FileHandler(String fileName) {

      try {
        in = new FileInputStream("input.txt");
        out = new FileOutputStream("output.txt");

        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
    }finally {
        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
    }
}