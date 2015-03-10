package com.epam.ef.blog.entity;

import java.util.Date;
import java.util.List;

public class Blog extends BaseEntity implements Comparable<Blog> {

    private final Date createdDate = new Date();
    private final User author;
    private String title;
    private String description;
    private int rating;
    private List<Post> posts;
    private List<Tag> tags;

    public Blog(User author) {
        this.author = author;
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
                "createdDate=" + createdDate +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", posts=" + posts +
                ", tags=" + tags +
                '}';
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public User getAuthor() {
        return author;
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
