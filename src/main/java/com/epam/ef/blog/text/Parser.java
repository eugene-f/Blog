package com.epam.ef.blog.text;

import org.boon.Boon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    static final String REGEX_PARAGRAPH_SEPARATOR = "\\n";
    static final String REGEX_SENTENCE_SEPARATOR = "\\. ";
    static final String REGEX_WORD_SEPARATOR = " ";
    static final String REGEX_SYMBOL_SEPARATOR = "";

    public static void parse(String string) {

        System.out.println(string);
        System.out.println();

        Text text = new Text(string);
        text.print();

        System.out.println(Boon.toPrettyJson(text));

    }

    public static void sandbox() {
        Pattern pattern = Pattern.compile("([a-z]+|[0-9]+|\\.+)+\\.(com|org|ru|kz)");
        Matcher matcher = pattern.matcher("www.kstu.kz");
        System.out.println(matcher.matches());
    }

}
