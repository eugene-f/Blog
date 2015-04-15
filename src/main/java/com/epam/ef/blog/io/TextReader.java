package com.epam.ef.blog.io;

import java.io.*;
import java.util.Scanner;

public class TextReader {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream inputStream;
        inputStream = new FileInputStream(new File("in.txt"));

        byte[] value = new byte[inputStream.read()];
        int byteCount = inputStream.read(value);

        inputStream.close();

        System.out.println(byteCount);
        System.out.println(value);

        Reader reader = new FileReader(new File("in.txt"));
        char[] chars = new char[0];
        StringBuffer stringBuffer = new StringBuffer();
        reader.read();
    }

    public static String readFile(String fileName) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(new File(fileName));

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine() + "\n");
        }
        scanner.close();

        return stringBuilder.toString();
    }

    public static String readFile(InputStream inputStream) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine() + "\n");
        }
        scanner.close();

        return stringBuilder.toString();
    }

}
