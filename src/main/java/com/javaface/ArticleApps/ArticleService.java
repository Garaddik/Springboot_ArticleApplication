package com.javaface.ArticleApps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	
	@Autowired 
	ArticleDao dao;

	public void createArticle(Article article) {
		dao.createArticle(article);
	}

	public List<Article> getArticles() {
		return dao.getArticles();
	}

	public void updateArticle(Article article) {
		dao.updateArticle(article);
	}

	public Article fetchArticle(String guid) {
		return dao.fethcArticle(guid);
	}

	public void deleteArticle(String guid) {
		dao.deleteArticle(guid);
	}
}
