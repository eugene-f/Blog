package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.User;
import com.thedeanda.lorem.Lorem;

public class UserFactory {

    public static User createUser() {
        User user = new User();
        user.setRole(RoleFactory.getRandomRole());
        user.setName(Lorem.getName());
        user.setSurname(Lorem.getLastName());
//        user.setRegistration(new Date().getDate());
        user.setEmail(Lorem.getWords(1)+"@"+Lorem.getWords(1)+".com");
        user.setPasswordHash("354df541a3524351321212d3s351t23e55621tg3y1435yrt");
        user.setPosts(PostFactory.createPosts(9));
        user.setFavorites(PostFactory.createPosts(4));
        return user;
    }
}
