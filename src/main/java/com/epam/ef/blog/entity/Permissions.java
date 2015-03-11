package com.epam.ef.blog.entity;

public class Permissions {

    private final boolean create;
    private final boolean edit;
    private final boolean delete;

    public Permissions(boolean create, boolean edit, boolean delete) {
        this.create = create;
        this.edit = edit;
        this.delete = delete;
    }

    public boolean isCreate() {
        return create;
    }

    public boolean isEdit() {
        return edit;
    }

    public boolean isDelete() {
        return delete;
    }

}
