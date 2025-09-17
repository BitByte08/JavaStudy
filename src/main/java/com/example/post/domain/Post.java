package com.example.post.domain;

import com.example.common.domain.PositiveIntegerCounter;
import com.example.post.domain.content.PostContent;
import com.example.user.domain.User;

public class Post {

    private final Long id;
    private final User author;
    private final PostContent content;
    private final PositiveIntegerCounter likeCount;

    public Post(Long id, User author, PostContent content) {
        if(author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.id = id;
        this.author = author;
        this.content = content;
        likeCount=new PositiveIntegerCounter();
    }

    public void like(User user) {
        if(user.equals(this.author)) throw new IllegalArgumentException();
        likeCount.increase();
    }

    public void unlike(){
        likeCount.decrease();
    }
}