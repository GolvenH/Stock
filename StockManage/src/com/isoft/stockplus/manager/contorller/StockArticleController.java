package com.isoft.stockplus.manager.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoft.stockplus.manager.po.Article;
import com.isoft.stockplus.manager.po.User;
import com.isoft.stockplus.manager.service.StockArticleService;
import com.isoft.stockplus.manager.service.StockUserService;
import com.isoft91.common.base.controller.BaseController;



@RequestMapping("/article")
@Controller
public class StockArticleController extends BaseController {

	@Autowired
	private StockArticleService  service;
	
	@RequestMapping("/all.do")
	@ResponseBody
	public List<Article>  getAllstaff(){
		
		return service.findall();
		
	}
	@RequestMapping("/add.do")
	@ResponseBody
	public String addstaff(Article article){
		
		service.addArticle(article);
		
		return "OK";
	}
}
