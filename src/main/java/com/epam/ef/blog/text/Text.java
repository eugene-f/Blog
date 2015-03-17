package com.epam.ef.blog.text;

import java.util.ArrayList;
import java.util.List;

public class Text {

    private List<Paragraph> value = new ArrayList<Paragraph>();

    public Text(String text) {
        String[] split = text.split(Parser.REGEX_PARAGRAPH_SEPARATOR);
        for (String paragraph : split) {
            this.value.add(new Paragraph(paragraph));
        }
    }

    public void print() {
        for (Paragraph paragraph : value) {
            paragraph.print();
        }
    }

}
