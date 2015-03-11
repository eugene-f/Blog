package com.epam.ef.blog.entity;

import java.util.List;

public class Tag extends BaseEntity implements Comparable<Tag> {

    private final Blog blog;
    private final String title;
    private List<Post> posts;

    public Tag(Blog blog, String title) {
        this.blog = blog;
        this.title = title;
    }

    @Override
    public int compareTo(Tag otherTag) {
        int thisPostsCount = this.posts.size();
        int anotherPostsCount = otherTag.posts.size();
        return (thisPostsCount < anotherPostsCount ? -1 : (thisPostsCount == anotherPostsCount ? 0 : 1));
    }

    public Blog getBlog() {
        return blog;
    }

    public String getTitle() {
        return title;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

}
