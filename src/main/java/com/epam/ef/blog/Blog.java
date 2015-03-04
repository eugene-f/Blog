package com.epam.ef.blog;

import java.util.List;

public class Blog extends BaseEntity implements Comparable<Blog> {
    private String title;
    private String description;
    private User author;
    private int rating;
    private List<Post> posts;
    private List<Tag> tags;

    public Blog(String title, User author) {
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public int compareTo(Blog otherBlog) {
        int thisRating = this.rating;
        int otherRating = otherBlog.rating;
        return (thisRating < otherRating ? -1 : (thisRating == otherRating ? 0 : 1));
    }

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", posts=" + posts +
                '}';
    }
}
