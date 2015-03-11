package com.epam.ef.blog.entity;

public class Role {

    private final String name;
    private final Permissions permissions;

    public Role(String name, Permissions permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public Permissions getPermissions() {
        return permissions;
    }

}
