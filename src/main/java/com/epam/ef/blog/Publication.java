package com.epam.ef.blog;

import java.util.Date;
import java.util.List;

public abstract class Publication extends BaseEntity implements Comparable<Publication> {
    private User author;
    private Date date;
    private String content;
    private List<User> likes;

    @Override
    public int compareTo(Publication anotherPublication) {
        Date thisDate = this.date;
        Date anotherDate = anotherPublication.date;
        return thisDate.compareTo(anotherDate);
    }
}
