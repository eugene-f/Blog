package com.epam.ef.blog.entity;

import com.epam.ef.blog.Utils;

import java.util.UUID;

public class BaseEntity {

    private final int id = Utils.random.nextInt();
    private final UUID uuid = UUID.randomUUID();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int getId() {
        return id;
    }

    public UUID getUuid() {
        return uuid;
    }

}
