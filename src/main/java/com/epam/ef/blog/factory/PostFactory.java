package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.Post;

import java.util.ArrayList;
import java.util.List;

public class PostFactory {

    private static List<Post> posts = new ArrayList<Post>();

//    static {
//        for (int i = 0; i < 15; i++) {
//            posts.add(new Post(BlogFactory.getBlog(), UserFactory.getRandomUser()));
//        }
//    }

    public static Post createPost() {
        Post post = new Post();
        post.setTitle("Title");
        post.setContent("Content");
        return post;
    }

    public static List<Post> createPosts() {
        for (int i = 0; i < 3; i++) {
            posts.add(createPost());
        }
        return posts;
    }
}
