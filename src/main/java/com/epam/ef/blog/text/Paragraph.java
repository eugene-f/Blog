package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
    private List<Sentence> value = new ArrayList<Sentence>();

    public Paragraph(String s) {
        String[] split = s.split("\\n");
        for (String ss : split) {
            this.value.add(new Sentence(ss));
        }
    }

}
