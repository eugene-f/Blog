package com.epam.ef.blog;

public class BlogFactory {
    public static Blog createBlog() {
        return new Blog("Cars", UserFactory.getRandomUser());
    }
}
