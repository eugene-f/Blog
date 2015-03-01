package com.epam.ef.blog;

import java.util.Date;
import java.util.List;

public abstract class Publication extends BaseEntity {
    private User author;
    private Date date;
    private String content;
    private List<User> likes;
}
