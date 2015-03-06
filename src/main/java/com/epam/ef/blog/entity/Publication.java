package com.epam.ef.blog.entity;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public abstract class Publication extends BaseEntity implements Comparable<Publication> {
    private User author;
    private Date date;
    private String content;
    private List<User> likes;

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    @Override
    public String toString() {
        return "Publication{" +
                "author=" + author +
                ", date=" + date +
                ", content='" + content + '\'' +
                ", likes=" + likes +
                '}';
    }

    @Override
    public int compareTo(Publication otherPublication) {
        Date thisDate = this.date;
        Date anotherDate = otherPublication.date;
        return thisDate.compareTo(anotherDate);
    }

    public int getLikesCount() {
        return likes.size();
    }

    public static class sortPublicationsByLikes implements Comparator<Publication> {
        @Override
        public int compare(Publication o1, Publication o2) {
            return Integer.compare(o1.getLikesCount(), o2.getLikesCount());
        }
    }
}
