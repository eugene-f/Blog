package com.epam.ef.blog.entity;

import java.util.List;

public class Post extends Publication {

    private final Blog blog;
    private String title;
    private List<Comment> comments;
    private List<Tag> tags;

    public Post(Blog blog) {
        super(blog.getAuthor());
        this.blog = blog;
    }

    public Blog getBlog() {
        return blog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

}
