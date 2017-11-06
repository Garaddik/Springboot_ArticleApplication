package com.javaface.ArticleApps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

	@Autowired
	ArticleService service;
	
	@RequestMapping(value = "/articles", method = RequestMethod.POST)
	public void postArticle(@RequestBody Article article) {
		service.createArticle(article);
	}
	
	@RequestMapping("/articles")
	public List<Article> getArticles(){
		return service.getArticles();
	}
}
