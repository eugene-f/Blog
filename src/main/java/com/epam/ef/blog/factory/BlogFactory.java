package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.Blog;
import com.thedeanda.lorem.Lorem;

import java.util.Random;

public class BlogFactory {

    private static final Random random = new Random();

    public static Blog createBlog() {
        Blog blog = new Blog();
        blog.setTitle(Lorem.getTitle(3, 7));
        blog.setDescription(Lorem.getWords(10, 25));
        blog.setAuthor(UserFactory.createUser());
        blog.setRating(random.nextInt(4803140));
        blog.setPosts(PostFactory.createPosts(random.nextInt(15)));
        return blog;
    }
}
