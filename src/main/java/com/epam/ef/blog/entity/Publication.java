package com.epam.ef.blog.entity;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public abstract class Publication extends BaseEntity implements Comparable<Publication> {

    private final Date date = new Date();
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

    @Override
    public String toString() {
        return "Publication{" +
                "date=" + date +
                ", author=" + author +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }

    public Date getDate() {
        return date;
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
