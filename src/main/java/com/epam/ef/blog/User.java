package com.epam.ef.blog;

import java.util.Date;
import java.util.List;

public class User extends BaseEntity implements Comparable<User> {
    private Role role;
    private String name;
    private String surname;
    private byte age;
    private Date birthday;
    private Date registration;
    private String email;
    private String passwordHash;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Post> favorites;
    private List<User> subscriptions;
    private List<User> subscribers;

    @Override
    public int compareTo(User anotherUser) {
        int thisPostsCount = this.posts.size();
        int anotherPostsCount = anotherUser.posts.size();
        return (thisPostsCount < anotherPostsCount ? -1 : (thisPostsCount == anotherPostsCount ? 0 : 1));
    }

}
