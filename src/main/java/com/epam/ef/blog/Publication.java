package com.epam.ef.blog;

import java.util.ArrayList;
import java.util.Date;

public class Publication {
    int publicationId;
    User author;
    Date date;
    String content;
    ArrayList<User> likes;
}
