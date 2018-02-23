package com.mikaila.springbootsoapwebservice.service;

import java.util.List;

import com.mikaila.springbootsoapwebservice.entity.Article;

public interface IArticleService {
	List<Article>getAllArticles();
	Article getArticleById(long articleId);
	boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(Article article);
}
