package com.epam.ef.blog;

import java.util.List;

public class Post extends Publication {
    private List<User> visibility;
    private List<User> reposts;
    private List<Tag> tags;
}
