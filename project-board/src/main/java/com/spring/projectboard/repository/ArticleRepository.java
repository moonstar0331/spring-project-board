package com.spring.projectboard.repository;

import com.spring.projectboard.domain.Article;
import com.spring.projectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
