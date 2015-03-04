package com.epam.ef.blog;

import java.util.Random;

public class RoleFactory {
    private static final Role ADMIN = new Role("ADMIN", new Permissions(true, true, true));
    private static final Role EDITOR = new Role("EDITOR", new Permissions(true, true, false));
    private static final Role USER = new Role("USER", new Permissions(true, false, false));
    private static final Role GUEST = new Role("GUEST", new Permissions(false, false, false));
    private static final Role[] ROLES = new Role[] {ADMIN, EDITOR, USER, GUEST};
    private static final Random random = new Random();

    public static Role getRandomRole() {
        return ROLES[random.nextInt(3)];
    }
}
