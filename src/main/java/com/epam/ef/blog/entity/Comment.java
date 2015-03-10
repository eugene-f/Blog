package com.epam.ef.blog.entity;

public class Comment extends Publication {

    private final Publication target;

    public Comment(User user, Post target) {
        super(user);
        this.target = target;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "target=" + target +
                '}';
    }

    public Publication getTarget() {
        return target;
    }

}
