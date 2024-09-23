package com.example.demo.Article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getList(){
        return this.articleRepository.findAll();
    }


    public Article getArticle(Integer id) {

        Optional<Article> optionalArticle = this.articleRepository.findById(id);
        if(optionalArticle.isEmpty()){
            return null;
        }
        return optionalArticle.get();
    }
}
