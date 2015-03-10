package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.User;
import com.thedeanda.lorem.Lorem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class UserFactory {

    private static final Random random = new Random();
    private static List<User> users = new ArrayList<User>();

    public static User create() {
        User user = new User();
        user.setRole(RoleFactory.getRandom());
        user.setFirstName(Lorem.getFirstName());
        user.setLastName(Lorem.getLastName());
        user.setEmail(user.getFirstName() + "_" + user.getLastName() + "@gmail.com");
        user.setPasswordHash(UUID.randomUUID().toString());
//        user.setPosts();
//        user.setComments();
//        user.setFavorites();
//        user.setSubscriptions();
//        user.setSubscribers();
        users.add(user);
        return user;
    }

    public static User getRandom() {
        if (users.size() > 0) {
            return users.get(random.nextInt(users.size()));
        } else {
            return UserFactory.create();
        }
    }

    public static List<User> create(int count) {
        for (int i = 0; i < count; i++) {
            users.add(create());
        }
        return users;
    }

    public static List<User> getUsers() {
        return users;
    }

}
