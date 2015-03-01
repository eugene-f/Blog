package com.epam.ef.blog;

import java.util.List;

public class Blog extends BaseEntity {
    private String title;
    private String description;
    private User author;
    private int rating;
    private List<Post> posts;
    private List<Tag> tags;
}
