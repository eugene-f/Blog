package com.epam.ef.blog;

public class Runner {

    public static Blog blog = BlogFactory.getBlog();

    public static void main(String[] args) {
        Blog blog = BlogFactory.createBlog();
        System.out.println(blog.toString());
//        for (int i = 0; i < 5; i++) {
//            System.out.println(UserFactory.getRandomUser().toString());
//        }
    }
}
