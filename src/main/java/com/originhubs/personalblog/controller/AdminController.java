package com.originhubs.personalblog.controller;

import com.originhubs.personalblog.model.Article;
import com.originhubs.personalblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ArticleService articleService;

    // Add new article
    @PostMapping("/add")
    public String addArticle(@RequestParam String title, @RequestParam String content) {
        Article article = new Article(0, title, LocalDate.now(), content);
        articleService.addArticle(article);
        return "Article added successfully";
    }

    // Delete article by ID
    @DeleteMapping("/delete/{id}")
    public String deleteArticle(@PathVariable int id) {
        articleService.deleteArticle(id);
        return "Article deleted successfully";
    }

    // List all articles
    @GetMapping("/list")
    public List<Article> listArticles() {
        return articleService.getAllArticles();
    }
}
