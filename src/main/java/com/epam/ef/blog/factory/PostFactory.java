package com.epam.ef.blog.factory;

import com.epam.ef.blog.Utils;
import com.epam.ef.blog.entity.Blog;
import com.epam.ef.blog.entity.Post;
import com.epam.ef.blog.entity.User;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PostFactory {

    private static List<Post> posts = new ArrayList<Post>();

//    static {
//        for (int i = 0; i < 15; i++) {
//            posts.add(new Post(BlogFactory.getBlog(), UserFactory.getRandomUser()));
//        }
//    }

    public static Post create(Blog blog) {
        Post post = new Post(blog);
        post.setTitle(Lorem.getTitle(3, 15));
//        post.setComments();
//        post.setTags();
        post.setContent(Lorem.getHtmlParagraphs(3, 7));
        post.setLikes(UserFactory.create(Utils.random.nextInt(100)));
        posts.add(post);
        return post;
    }

    public static List<Post> create(Blog blog, int count) {
        List<Post> posts = new ArrayList<Post>();
        for (int i = 0; i < count; i++) {
            posts.add(create(blog));
        }
        return posts;
    }

    public static List<Post> getPosts() {
        return posts;
    }
}
