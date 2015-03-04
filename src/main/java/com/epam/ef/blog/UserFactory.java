package com.epam.ef.blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserFactory {
    private static List<User> users = new ArrayList<User>();
    private static final Random random = new Random();

    static {
        for (int i = 0; i < 10; i++) {
            users.add(new User("Tony" + random.nextInt(9), "Stark", random.nextInt(999) + "@gmail.com", RoleFactory.getRandomRole()));
        }
    }

    public static User getRandomUser() {
        return users.get(random.nextInt(10));
    }
}
