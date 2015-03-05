package com.epam.ef.blog.entity;

import java.util.List;

public class Blog extends BaseEntity implements Comparable<Blog> {
    private String title;
    private String description;
    private User author;
    private int rating;
    private List<Post> posts;
    private List<Tag> tags;

    @Override
    public int compareTo(Blog otherBlog) {
        int thisRating = this.rating;
        int otherRating = otherBlog.rating;
        return (thisRating < otherRating ? -1 : (thisRating == otherRating ? 0 : 1));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
