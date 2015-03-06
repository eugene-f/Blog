package com.epam.ef.blog.entity;

import java.util.List;

public class Post extends Publication {
    private Blog blog;
    private String title;
    private List<User> visibility;
    private List<User> reposts;
    private List<Comment> comments;
    private List<Tag> tags;

    @Override
    public String toString() {
        return "Post{" + "\n" +
                "blog=" + blog + "\n" +
                ", title='" + title + '\'' + "\n" +
                ", visibility=" + visibility + "\n" +
                ", reposts=" + reposts + "\n" +
                ", comments=" + comments + "\n" +
                ", tags=" + tags + "\n" +
                '}' + super.toString();
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<User> getVisibility() {
        return visibility;
    }

    public void setVisibility(List<User> visibility) {
        this.visibility = visibility;
    }

    public List<User> getReposts() {
        return reposts;
    }

    public void setReposts(List<User> reposts) {
        this.reposts = reposts;
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
