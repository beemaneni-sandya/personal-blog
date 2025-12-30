package com.originhubs.personalblog.controller;

import com.originhubs.personalblog.service.ArticleService;
import com.originhubs.personalblog.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GuestController {

    private final ArticleService articleService;

    public GuestController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "home";
    }

    @GetMapping("/article/{title}")
    public String viewArticle(@PathVariable String title, Model model) {
        Article article = articleService.getArticleByTitle(title);
        model.addAttribute("article", article);
        return "article";
    }
}