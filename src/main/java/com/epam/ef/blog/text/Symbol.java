package com.epam.ef.blog.text;

public class Symbol extends SentencePart {
    private char value;

    public Symbol(String c) {
        this.value = c.charAt(0);
    }
}
