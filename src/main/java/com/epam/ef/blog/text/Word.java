package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Word extends SentencePart {

        private List<Symbol> value = new ArrayList<Symbol>();

    public Word(String word) {
        String[] split = word.split(Parser.REGEX_SYMBOL_SEPARATOR);
        for (String ss : split) {
            this.value.add(new Symbol(ss));
        }
    }

    public void print() {
        for (Symbol symbol : value) {
            symbol.print();
        }
        System.out.print(" ");
    }

}
