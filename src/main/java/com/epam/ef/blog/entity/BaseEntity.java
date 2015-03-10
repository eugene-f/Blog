package com.epam.ef.blog.entity;

import java.util.Random;
import java.util.UUID;

public class BaseEntity {

    private static final Random random = new Random();

    private final int id = random.nextInt();
    private final UUID uuid = UUID.randomUUID();

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

    public UUID getUuid() {
        return uuid;
    }

}
