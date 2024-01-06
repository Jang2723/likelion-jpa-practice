package com.example.jpapractice.article;

import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    public void create(
            String title,
            String content,
            String writer
    ){
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setWriter(writer);
    }
}
