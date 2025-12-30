package com.originhubs.personalblog.controller;

import com.originhubs.personalblog.model.Article;
import com.originhubs.personalblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private ArticleService articleService;

    // Get all articles
    @GetMapping("/all")
    public String getAllArticles(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "home"; // this maps to home.html
    }

    // Get article by ID
    @GetMapping("/{id}")
    public Article getArticle(@PathVariable int id) {
        return articleService.getArticleById(id);
    }

    // Update article
    @PutMapping("/update/{id}")
    public String updateArticle(@PathVariable int id, @RequestParam String title, @RequestParam String content) {
        articleService.updateArticle(id, title, content);
        return "Article updated successfully";
    }
}
