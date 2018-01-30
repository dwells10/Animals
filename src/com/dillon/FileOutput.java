package com.dillon;


public class FileOutput {

    FileOutputStream out = null;


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

    public void fileClose() {
        if (out != null) {
            out.close();
        }

    }
}