package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.Blog;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlogFactory {

    private static final Random random = new Random();
    private static List<Blog> blogs = new ArrayList<Blog>();

    public static Blog create() {
        Blog blog = new Blog(UserFactory.create());
        blog.setTitle(Lorem.getTitle(3, 7));
        blog.setDescription(Lorem.getWords(10, 25));
        blog.setRating(random.nextInt());
        blog.setPosts(PostFactory.create(random.nextInt(3)));
//        blog.setTags();
        blogs.add(blog);
        return blog;
    }

    public static Blog getRandom() {
        if (blogs.size() > 0) {
            return blogs.get(random.nextInt(blogs.size()));
        } else {
            return BlogFactory.create();
        }
    }

    public static List<Blog> getBlogs() {
        return blogs;
    }
}
