package com.example.demo;

import com.example.demo.Article.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private ArticleService articleService;

	@Test
	void contextLoads() {
	}
}
