package com.example.post.domain.content;

public class PostContent extends Content {
    protected PostContent(String contentText) {
        super(contentText);
    }
    @Override
    protected void checkText(String contentText) {
        if(contentText == null || contentText.length()<=5 || contentText.length()>500) {
            throw new IllegalArgumentException("Content length must be between 5 and 500");
        }
    }

    public String getContent() {
        return contentText;
    }
}