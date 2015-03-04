package com.epam.ef.blog;

import java.util.List;

public class Role {
    private String name;
    private Permissions permissions;

    public Role(String name, Permissions permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
