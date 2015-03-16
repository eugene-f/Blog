package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Paragraph> value = new ArrayList<Paragraph>();

    public Text(String s) {
        String[] split = s.split("\\n");
        for (String ss : split) {
            this.value.add(new Paragraph(ss));
        }
    }

    public void print() {
        for (Paragraph paragraph : value) {
            paragraph.print();
        }
    }

}
