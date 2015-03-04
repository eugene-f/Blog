package com.epam.ef.blog;

import java.util.List;
import java.util.Map;

public class Blog extends BaseEntity implements Comparable<Blog> {
    private String title;
    private String description;
    private User author;
    private int rating;
    private List<Post> posts;
    private List<Tag> tags;

    @Override
    public int compareTo(Blog anotherBlog) {
        int thisRating = this.rating;
        int anotherRating = anotherBlog.rating;
        return (thisRating < anotherRating ? -1 : (thisRating == anotherRating ? 0 : 1));
    }

}
