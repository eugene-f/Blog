package com.epam.ef.blog.entity;

import java.util.Date;
import java.util.List;

public class User extends BaseEntity implements Comparable<User> {
    private Role role;
    private String name;
    private String surname;
    private Date registration;
    private String email;
    private String passwordHash;
    private List<Post> posts;
    private List<Comment> comments;
    private List<Post> favorites;
    private List<User> subscriptions;
    private List<User> subscribers;

    @Override
    public int compareTo(User otherUser) {
        int thisPostsCount = this.posts.size();
        int anotherPostsCount = otherUser.posts.size();
        return (thisPostsCount < anotherPostsCount ? -1 : (thisPostsCount == anotherPostsCount ? 0 : 1));
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Post> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Post> favorites) {
        this.favorites = favorites;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<User> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<User> subscribers) {
        this.subscribers = subscribers;
    }
}
