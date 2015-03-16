package com.epam.ef.blog.text;

public class Symbol extends SentencePart {

    private String value;

    public Symbol(String c) {
        this.value = c;
    }

    public void print() {
        System.out.println(value);
    }

}
