package com.epam.ef.blog;

import com.epam.ef.blog.entity.Blog;
import com.epam.ef.blog.factory.BlogFactory;
import com.epam.ef.blog.factory.UserFactory;
import org.boon.Boon;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class Runner {

    public static void main(String[] args) {
        Blog blog = BlogFactory.create();
        System.out.println(blog.toString());

        ResourceBundle resourceBundle = ResourceBundle.getBundle("strings");
        System.out.println(resourceBundle.getString("title"));

        System.out.println(Boon.toPrettyJson(blog));

    }
}
