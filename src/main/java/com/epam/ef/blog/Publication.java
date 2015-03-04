package com.epam.ef.blog;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public abstract class Publication extends BaseEntity implements Comparable<Publication> {
    private User author;
    private Date date;
    private String content;
    private List<User> likes;

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public int compareTo(Publication otherPublication) {
        Date thisDate = this.date;
        Date anotherDate = otherPublication.date;
        return thisDate.compareTo(anotherDate);
    }

    public static class sortPublicationsByLikes implements Comparator<Publication> {
        @Override
        public int compare(Publication o1, Publication o2) {
            return Integer.compare(o1.getLikesCount(), o2.getLikesCount());
        }
    }

    public int getLikesCount() {
        return likes.size();
    }
}
