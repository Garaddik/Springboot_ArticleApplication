package com.javaface.ArticleApps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleDao {
	
	
	@Autowired 
	ArticleRepository articleRepository;
	
	
	public void createArticle(Article article) {
		articleRepository.save(article);
	}

	public List<Article> getArticles() {
		return (List<Article>) articleRepository.findAll();
	}

	public void updateArticle(Article article) {
		articleRepository.save(article);
	}

	public Article fethcArticle(String guid) {
		return articleRepository.findOne(guid);
	}

	public void deleteArticle(String guid) {
		articleRepository.delete(guid);
	}
}
