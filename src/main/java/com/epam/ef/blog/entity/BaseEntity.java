package com.epam.ef.blog.entity;

import java.util.Random;
import java.util.UUID;

public class BaseEntity {
    private static final Random random = new Random();
    private int id;
    private UUID uuid = UUID.randomUUID();

    public BaseEntity() {
        id = random.nextInt();
        uuid = UUID.randomUUID();
    }

    public static Random getRandom() {
        return random;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
