package com.epam.ef.blog.text;

public class Symbol extends SentencePart {

    private String value;

    public Symbol(String symbol) {
        this.value = symbol;
    }

    public void print() {
        System.out.print(value);
    }

}
