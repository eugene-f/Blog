package com.epam.ef.blog.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class TextReader {

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
