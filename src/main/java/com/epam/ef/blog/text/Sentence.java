package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<SentencePart> value = new ArrayList<SentencePart>();

    public Sentence(String s) {
        String[] split = s.split("\\. ");
        for (String ss : split) {
            this.value.add(new Word(ss));
        }
    }
}
