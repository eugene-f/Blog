package com.epam.ef.blog;

import java.util.List;

public class Tag extends BaseEntity {
    private String title;
    private Blog blog;
    private List<Post> posts;
}
