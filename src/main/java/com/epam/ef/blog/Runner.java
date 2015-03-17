package com.epam.ef.blog;

import com.epam.ef.blog.entity.Blog;
import com.epam.ef.blog.factory.BlogFactory;
import com.epam.ef.blog.io.TextReader;
import com.epam.ef.blog.text.Parser;
import com.epam.ef.blog.text.Text;
import com.thedeanda.lorem.Lorem;
import org.boon.Boon;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException {

//        createBlog();

//        getResource();

//        readFile();

        parseText();

    }

    private static void createBlog() {
        Blog blog = BlogFactory.create();
        System.out.println(blog.toString());
        System.out.println(Boon.toPrettyJson(blog));
    }

    private static void getResource() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("strings");
        System.out.println(resourceBundle.getString("title"));
    }

    private static void readFile() throws FileNotFoundException {
        System.out.println("File: " + TextReader.readFile("in.txt"));

        InputStream inputStream = Runner.class.getResourceAsStream("inC.txt");
        System.out.println("Stream: " + TextReader.readFile(inputStream));
    }

    private static void parseText() {
        String text;
        text = Lorem.getParagraphs(2, 2);
        text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Donec interdum quam id erat condimentum imperdiet.\n" +
                "Nunc iaculis, ex non imperdiet pulvinar, sem purus convallis nunc, a faucibus risus eros et nibh.";
        Parser.parse(text).print();
    }

    public static void sandbox() {
        Pattern pattern = Pattern.compile("([a-z]+|[0-9]+|\\.+)+\\.(com|org|ru|kz)");
        Matcher matcher = pattern.matcher("www.kstu.kz");
        System.out.println(matcher.matches());
    }

}
