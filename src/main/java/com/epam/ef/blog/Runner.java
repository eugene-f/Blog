package com.epam.ef.blog;

import com.epam.ef.blog.entity.Blog;
import com.epam.ef.blog.factory.BlogFactory;

public class Runner {

    public static void main(String[] args) {
        Blog blog = BlogFactory.createBlog();
        System.out.println(blog.toString());
    }
}
