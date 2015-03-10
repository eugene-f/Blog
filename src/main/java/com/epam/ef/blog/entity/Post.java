package com.epam.ef.blog.entity;

import java.util.List;

public class Post extends Publication {

    private final Blog blog;
    private String title;
    private List<User> visibility;
    private List<User> reposts;
    private List<Comment> comments;
    private List<Tag> tags;

    public Post(User user, Blog blog) {
        super(user);
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Post{" +
                "blog=" + blog +
                ", title='" + title + '\'' +
                ", visibility=" + visibility +
                ", reposts=" + reposts +
                ", comments=" + comments +
                ", tags=" + tags +
                '}';
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
