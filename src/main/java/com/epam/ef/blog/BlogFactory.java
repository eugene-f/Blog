package com.epam.ef.blog;

public class BlogFactory {

    private static Blog blog = new Blog("Cars", UserFactory.getRandomUser());

    public static Blog getBlog() {
        return blog;
    }
}
