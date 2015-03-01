package com.epam.ef.blog;

import java.util.UUID;

public class BaseEntity {
    private int id;
    private UUID uuid = UUID.randomUUID();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
