package com.isoft.stockplus.manager.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoft.stockplus.manager.dao.StockArticleDao;
import com.isoft.stockplus.manager.po.Article;

@Service
public class StockArticleService {
	@Autowired
	private StockArticleDao  dao;

	
	public void addArticle(Article article){
		
		dao.saveOrUpdate(article);
	}
	
	
	public List<Article> findall(){
		
		return dao.findAll();
		
		
	}
	
	public List<Article> findById(){
		return null;
		
//		return dao.findById(Int id);
	}


	 public Map<String,Object> findbypage(Integer first,Integer max){
			
			return dao.findByPage(first, max);
			
		}


	public void deleteArticlebyid(Integer id)
	{
		// TODO Auto-generated method stub
		dao.deleteById(id);		

	}
}
