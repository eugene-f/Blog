package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {

    private List<Sentence> value = new ArrayList<Sentence>();

    public Paragraph(String paragraph) {
        String[] split = paragraph.split(Parser.REGEX_SENTENCE_SEPARATOR);
        for (String sentence : split) {
            this.value.add(new Sentence(sentence));
        }
    }

    public void print() {
        for (Sentence sentence : value) {
            sentence.print();
        }
        System.out.print("\n");
    }

}
