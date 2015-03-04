package com.epam.ef.blog;

public class Runner {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(UserFactory.getRandomUser().toString());
        }
    }
}
