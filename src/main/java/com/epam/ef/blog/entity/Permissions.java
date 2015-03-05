package com.epam.ef.blog.entity;

public class Permissions {
    private boolean create;
    private boolean edit;
    private boolean delete;

    public Permissions(boolean create, boolean edit, boolean delete) {
        this.create = create;
        this.edit = edit;
        this.delete = delete;
    }
}
