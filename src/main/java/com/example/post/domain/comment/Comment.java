package com.example.post.domain.comment;

import com.example.common.domain.PositiveIntegerCounter;
import com.example.post.domain.Post;
import com.example.post.domain.content.Content;
import com.example.user.domain.User;

public class Comment {
    private final Long id;
    private final Post post;
    private final User author;
    private final Content content;
    private final PositiveIntegerCounter likeCount;

    public Comment(Long id, Post post, User author, Content content) {
        if(author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        if(post == null) {
            throw new IllegalArgumentException("Post cannot be null");
        }
        if(content == null) {
            throw new IllegalArgumentException("Content cannot be null");
        }
        this.id = id;
        this.post = post;
        this.author = author;
        this.content = content;
        this.likeCount=new PositiveIntegerCounter();
    }
    public void like(User user){
        if(user.equals(this.author)) throw new IllegalArgumentException();
        likeCount.increase();
    }
    public void unlike(){
        likeCount.decrease();
    }
}