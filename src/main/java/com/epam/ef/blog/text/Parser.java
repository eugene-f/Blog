package com.epam.ef.blog.text;

import org.boon.Boon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    static final String REGEX_PARAGRAPH_SEPARATOR = "\\n";
    static final String REGEX_SENTENCE_SEPARATOR = "\\. ";
    static final String REGEX_WORD_SEPARATOR = " ";
    static final String REGEX_SYMBOL_SEPARATOR = "";

    public static Text parse(String string) {
        Text text = new Text(string);
        return text;
    }

}
