package com.epam.ef.blog.entity;

import com.epam.ef.blog.Utils;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public abstract class Publication extends BaseEntity implements Comparable<Publication> {

    private final Date date = new Date();
    private final String dateFormat = Utils.formatDate(date);
    private final User author;
    private String content;
    private List<User> likes;

    public Publication(User author) {
        this.author = author;
    }

    @Override
    public int compareTo(Publication otherPublication) {
        Date thisDate = this.date;
        Date anotherDate = otherPublication.date;
        return thisDate.compareTo(anotherDate);
    }

    public Date getDate() {
        return date;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public User getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<User> getLikes() {
        return likes;
    }

    public void setLikes(List<User> likes) {
        this.likes = likes;
    }

    public static class sortByLikes implements Comparator<Publication> {
        @Override
        public int compare(Publication o1, Publication o2) {
            return Integer.compare(o1.likes.size(), o2.likes.size());
        }
    }

}
