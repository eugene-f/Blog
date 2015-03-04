package com.epam.ef.blog;

import java.util.List;

public class Tag extends BaseEntity implements Comparable<Tag> {
    private String title;
    private Blog blog;
    private List<Post> posts;

    @Override
    public int compareTo(Tag otherTag) {
        int thisPostsCount = this.posts.size();
        int anotherPostsCount = otherTag.posts.size();
        return (thisPostsCount < anotherPostsCount ? -1 : (thisPostsCount == anotherPostsCount ? 0 : 1));
    }
}
