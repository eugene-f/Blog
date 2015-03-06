package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.Post;
import com.thedeanda.lorem.Lorem;

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
        post.setTitle(Lorem.getTitle(3, 10));
        post.setContent(Lorem.getHtmlParagraphs(3, 7));
        return post;
    }

    public static List<Post> createPosts(int count) {
        for (int i = 0; i < count; i++) {
            posts.add(createPost());
        }
        return posts;
    }
}
