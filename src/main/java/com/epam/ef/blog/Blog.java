package com.epam.ef.blog;

import java.util.Comparator;
import java.util.List;

public class Blog extends BaseEntity implements Comparable<Blog> {
    private String title;
    private String description;
    private User author;
    private int rating;
    private List<Post> posts;
    private List<Tag> tags;

    @Override
    public int compareTo(Blog otherBlog) {
        int thisRating = this.rating;
        int anotherRating = otherBlog.rating;
        return (thisRating < anotherRating ? -1 : (thisRating == anotherRating ? 0 : 1));
    }

    public static class sortBlogsByPostCount implements Comparator<Blog> {
        @Override
        public int compare(Blog o1, Blog o2) {
            return Integer.compare(o1.getPostsCount(), o2.getPostsCount());
        }
    }

    public int getPostsCount() {
        return posts.size();
    }
}
