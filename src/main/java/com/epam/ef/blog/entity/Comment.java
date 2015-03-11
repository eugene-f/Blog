package com.epam.ef.blog.entity;

public class Comment extends Publication {

    private final Publication target;

    public Comment(User author, Post target) {
        super(author);
        this.target = target;
    }

    public Publication getTarget() {
        return target;
    }

}
