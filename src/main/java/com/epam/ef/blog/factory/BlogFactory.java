package com.epam.ef.blog.factory;

import com.epam.ef.blog.Utils;
import com.epam.ef.blog.entity.Blog;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BlogFactory {

    private static List<Blog> blogs = new ArrayList<Blog>();

    public static Blog create() {
        Blog blog = new Blog(UserFactory.create());
        blog.setTitle(Lorem.getTitle(3, 7));
        blog.setDescription(Lorem.getWords(10, 25));
        blog.setRating(Utils.random.nextInt(1000));
        blog.setPosts(PostFactory.create(blog, Utils.random.nextInt(10)));
//        blog.setTags();
        blogs.add(blog);
        return blog;
    }

    public static List<Blog> getBlogs() {
        return blogs;
    }
}
