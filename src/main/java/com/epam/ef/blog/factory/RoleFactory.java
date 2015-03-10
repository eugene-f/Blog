package com.epam.ef.blog.factory;

import com.epam.ef.blog.entity.Permissions;
import com.epam.ef.blog.entity.Role;

import java.util.Random;

public class RoleFactory {

    private static final Random random = new Random();
    private static final Role GUEST = new Role("GUEST", new Permissions(false, false, false));
    private static final Role USER = new Role("USER", new Permissions(true, false, false));
    private static final Role EDITOR = new Role("EDITOR", new Permissions(true, true, false));
    private static final Role ADMIN = new Role("ADMIN", new Permissions(true, true, true));
    private static final Role[] ROLES = new Role[]{
            GUEST,
            USER,
            EDITOR,
            ADMIN
    };

    public static Role getRandom() {
        return ROLES[random.nextInt(ROLES.length)];
    }

}
