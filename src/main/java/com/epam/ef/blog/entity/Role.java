package com.epam.ef.blog.entity;

public class Role {
    private String name;
    private Permissions permissions;

    public Role(String name, Permissions permissions) {
        this.name = name;
        this.permissions = permissions;
    }
}
