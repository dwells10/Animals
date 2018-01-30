package com.dillon;


/**
 * @author Matt Green
 *
 * Ths class writes data to a file based on the filename given to the object.
 */

public class FileOutput {

    /**
     * initilizes the value out out to null
     */

    FileOutputStream out = null;


    /**
     *
     * @param fileName hold the filename to be written to
     */

    public FileOutput(String fileName) {
        try {
            out = new FileOutputStream(fileName);
        }
        catch(FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " "  + e);
        }
        finally {
            if (out != null) {
                out.close();
            }
        }

    }

    /**
     *
     * @param line writes line to file
     */

    public void fileWrite(String line) {
        try {
            out.write(line);
        }
        catch(Exception e) {
            System.out.println("File Write Error: " + fileName + " "  + e);
        }
        finally {
            if (out != null) {
                out.close();
            }
        }
    }

    /**
     *  Closes the file
     */

    public void fileClose() {
        if (out != null) {
            out.close();
        }

    }
}