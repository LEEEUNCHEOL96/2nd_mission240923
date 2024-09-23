package com.example.demo.Article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleRepository articleRepository;

    @GetMapping("/list")
    public String articleList(Model model){
        List<Article> articleList = this.articleRepository.findAll();
        model.addAttribute("article",articleList);

        return "article_list";
    }
}
