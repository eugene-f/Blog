package com.epam.ef.blog;

import java.util.List;

public class Post extends Publication {
    private Blog blog;
    private String title;
    private List<User> visibility;
    private List<User> reposts;
    private List<Comment> comments;
    private List<Tag> tags;

    public Post(Blog blog, User author) {
        this.blog = blog;
        super.setAuthor(author);
    }


}
