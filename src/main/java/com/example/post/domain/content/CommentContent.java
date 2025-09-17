package com.example.post.domain.content;


public class CommentContent extends Content {
    protected CommentContent(String contentText) {
        super(contentText);
    }
    @Override
    protected abstract void checkText(String contentText){
        if(contentText.length() > 100 || contentText == null)
            throw new IllegalArgumentException("Content cannot be null");
    }
}
