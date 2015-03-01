package com.epam.ef.blog;

import java.util.List;

public class User extends BaseEntity {
    private Role role;
    private String name;
    private String surname;
    private byte age;
    private String email;
    private String passwordHash;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Post> favorites;
    private List<User> subscriptions;
    private List<User> subscribers;
}
