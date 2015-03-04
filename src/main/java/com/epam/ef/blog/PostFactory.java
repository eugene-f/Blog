package com.epam.ef.blog;

import java.util.ArrayList;
import java.util.List;

public class PostFactory {

    private static List<Post> posts = new ArrayList<Post>();

    static {
        for (int i = 0; i < 15; i++) {
            posts.add(new Post(BlogFactory.getBlog(), UserFactory.getRandomUser()));
        }
    }

}
