package com.example.demo.Article;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

    @GetMapping("/list")
    public String articleList(Model model){
        List<Article> articleList = this.articleService.getList();
        model.addAttribute("articleList",articleList);

        return "article_list";
    }

    @GetMapping("/detail/{id}")
    public  String detail(@PathVariable("id") Integer id , Model model){
        Article article = this.articleService.getArticle(id);

        model.addAttribute("article", article);
        return "article_detail";
    }

    @GetMapping("/create")
    public String create(ArticleForm articleForm){

        return "article_form";
    }

    @PostMapping("/create")
    public String create(@Valid ArticleForm articleForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "article_form";
        }
        this.articleService.create(articleForm.getTitle(),articleForm.getContent());
        return "redirect:/article/list";
    }
}
