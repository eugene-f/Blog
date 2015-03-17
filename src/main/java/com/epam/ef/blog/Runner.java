package com.epam.ef.blog;

import com.epam.ef.blog.io.TextReader;
import com.epam.ef.blog.text.Parser;
import com.epam.ef.blog.text.Text;
import com.thedeanda.lorem.Lorem;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Runner {

    public static void main(String[] args) throws FileNotFoundException {

//        Blog blog = BlogFactory.create();
//        System.out.println(blog.toString());
//        System.out.println(Boon.toPrettyJson(blog));
//
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("strings");
//        System.out.println(resourceBundle.getString("title"));
//

//        String text = Lorem.getParagraphs(2, 2);
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Donec interdum quam id erat condimentum imperdiet.\n" +
                "Nunc iaculis, ex non imperdiet pulvinar, sem purus convallis nunc, a faucibus risus eros et nibh.";
        Parser.parse(text);

//        System.out.println(TextReader.readFile("in.txt"));
//
//        InputStream inputStream = new Runner().getClass().getResourceAsStream("inC.txt");
//        System.out.println(TextReader.readFile(inputStream));

    }

}
