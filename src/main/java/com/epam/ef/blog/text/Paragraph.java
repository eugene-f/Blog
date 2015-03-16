package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {

    private List<Sentence> value = new ArrayList<Sentence>();

    public Paragraph(String s) {
        String[] split = s.split(".*\\. ? ?.*");
        for (String ss : split) {
            this.value.add(new Sentence(ss));
        }
    }

    public void print() {
        for (Sentence sentence : value) {
            sentence.print();
        }
    }

}
