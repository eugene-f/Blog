package com.epam.ef.blog.factory;

import com.epam.ef.blog.Utils;
import com.epam.ef.blog.entity.Post;
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

    public static Post create() {
        Post post = new Post(UserFactory.getRandom(), BlogFactory.getRandom());
        post.setTitle(Lorem.getTitle(3, 15));
        post.setVisibility(UserFactory.getUsers());
        post.setReposts(UserFactory.getUsers());
//        post.setComments();
//        post.setTags();
        post.setContent(Lorem.getHtmlParagraphs(3, 7));
        post.setLikes(UserFactory.getUsers());
        posts.add(post);
        return post;
    }

    public static List<Post> create(int count) {
        for (int i = 0; i < count; i++) {
            posts.add(create());
        }
        return posts;
    }

    public static Post getRandom() {
        if (posts.size() > 0) {
            return posts.get(Utils.random.nextInt(posts.size()));
        } else {
            posts.add(PostFactory.create());
            return posts.get(0);
        }
    }

    public static List<Post> getPosts() {
        return posts;
    }
}
