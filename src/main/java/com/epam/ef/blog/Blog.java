package com.epam.ef.blog;

import java.util.ArrayList;

public class Blog {
    int blogId;
    User author;
    int rating;
    ArrayList<Post> posts = new ArrayList<Post>();
}
