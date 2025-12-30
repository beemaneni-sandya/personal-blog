package com.originhubs.personalblog.service;

import com.originhubs.personalblog.model.Article;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    private final List<Article> articles = new ArrayList<>();
    private int nextId = 1;

    // Add new article
    public void addArticle(Article article) {
        article.setId(nextId++);
        articles.add(article);
    }

    // Get article by ID
    public Article getArticleById(int id) {
        return articles.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // Update article
    public void updateArticle(int id, String title, String content) {
        Article article = getArticleById(id);
        if (article != null) {
            article.setTitle(title);
            article.setContent(content);
        }
    }

    // Delete article
    public void deleteArticle(int id) {
        articles.removeIf(a -> a.getId() == id);
    }

    // List all articles
    public List<Article> getAllArticles() {
        return articles;
    }

    // Optional: Get article by title
    public Article getArticleByTitle(String title) {
        return articles.stream()
                .filter(a -> a.getTitle().equalsIgnoreCase(title))
                .findFirst()
                .orElse(null);
    }
}
