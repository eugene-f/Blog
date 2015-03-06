package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.User;

public class UserFactory {

    public static User createUser() {
        User user = new User();
        user.setRole(RoleFactory.getRandomRole());
        user.setName("Name");
        user.setSurname("Surname");
//        user.setRegistration(new Date().getDate());
        user.setEmail("email.gmail.com");
        user.setPasswordHash("354df541a3524351321212d3s351t23e55621tg3y1435yrt");
        user.setPosts(PostFactory.createPosts());
        user.setFavorites(PostFactory.createPosts());
        return user;
    }
}
