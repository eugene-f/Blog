package com.epam.ef.blog.text;

import org.boon.Boon;
import org.boon.Str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static void parse(String string) {
//        Text text = new Text();
//        text.getValue().add(new Paragraph());

        System.out.println("string = [" + string + "]");

//        Pattern pattern = Pattern.compile(".+");
//        Matcher matcher = pattern.matcher(string);
//        System.out.println(matcher.matches());

//        String[] stringsSplit = string.split("\\. ? ?");
//
//        for (String s : stringsSplit) {
//            System.out.println("'" + s + "'\n");
//        }

        Text text = new Text(string);
        text.print();

        System.out.println(Boon.toPrettyJson(text));

    }
}
