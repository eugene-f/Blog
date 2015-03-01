package com.epam.ef.blog;

import java.util.List;

public class Tag extends BaseEntity {
    String title;
    List<Post> posts;
}
