package com.epam.ef.blog.entity;

import com.epam.ef.blog.Utils;

import java.util.Date;
import java.util.List;

public class User extends BaseEntity implements Comparable<User> {

    private final Date registrationDate = new Date();
    private final String registrationDateFormat = Utils.formatDate(registrationDate);
    private Role role;
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
    private List<Post> posts; // ToDo: replace posts on blogs
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

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public String getRegistrationDateFormat() {
        return registrationDateFormat;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
