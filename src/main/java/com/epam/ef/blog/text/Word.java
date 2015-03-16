package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Word extends SentencePart {
    private List<Symbol> value = new ArrayList<Symbol>();

    public Word(String s) {
        String[] split = s.split(".");
        for (String ss : split) {
            this.value.add(new Symbol(ss));
        }
    }
}
