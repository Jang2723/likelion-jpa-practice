package com.example.jpapractice.repo;

import com.example.jpapractice.article.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
