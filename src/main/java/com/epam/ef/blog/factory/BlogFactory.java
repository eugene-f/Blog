package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.Blog;
import com.epam.ef.blog.entity.User;

public class BlogFactory {
    public static Blog createBlog() {
        Blog blog = new Blog();
        blog.setTitle("About Time");
        blog.setDescription("This blog tell you about time");
        blog.setAuthor(UserFactory.createUser());
        blog.setRating(21343);
        blog.setPosts(PostFactory.createPosts());
        return blog;
    }
}
