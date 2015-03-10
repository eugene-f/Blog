package com.epam.ef.blog;

import com.epam.ef.blog.entity.Blog;
import com.epam.ef.blog.factory.BlogFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {

    public static void main(String[] args) {
        Blog blog = BlogFactory.create();
        System.out.println(blog.toString());
    }
}
