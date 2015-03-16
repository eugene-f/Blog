package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

    private List<Word> value = new ArrayList<Word>();

    public Sentence(String s) {
        String[] split = s.split(".* ? .*");
        for (String ss : split) {
            this.value.add(new Word(ss));
        }
    }

    public void print() {
        for (Word word : value) {
            word.print();
        }
    }

}
