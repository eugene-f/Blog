package com.epam.ef.blog.io;

import java.io.*;

public class TextWriter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        OutputStream outputStream;
        outputStream = new FileOutputStream(new File("out.txt"));
        outputStream.write(135135342);
        outputStream.close();
    }

    public static void writeFile(String string){

    }

}
