package com.spring.projectboard.service;

import com.spring.projectboard.domain.type.SearchType;
import com.spring.projectboard.dto.ArticleDto;
import com.spring.projectboard.dto.ArticleUpdateDto;
import com.spring.projectboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public Page<ArticleDto> searchArticles(SearchType title, String searchKeyword) {
        return Page.empty();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long articleId) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

    public void updateArticle(long articleId, ArticleUpdateDto dto) {

    }

    public void deleteArticle(long articleId) {

    }
}
