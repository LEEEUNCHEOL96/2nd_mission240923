package com.example.demo.Article;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
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

    public void create(String title, String content) {
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        article.setCreateDate(LocalDateTime.now());
        this.articleRepository.save(article);
    }

    public Page<Article> getList(int page){
        Pageable pageable = PageRequest.of(page,10);
        return this.articleRepository.findAll(pageable);
    }
}
