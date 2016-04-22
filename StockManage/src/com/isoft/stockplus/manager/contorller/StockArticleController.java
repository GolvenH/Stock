package com.isoft.stockplus.manager.contorller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoft.stockplus.manager.po.Article;
import com.isoft.stockplus.manager.po.User;
import com.isoft.stockplus.manager.service.StockArticleService;
import com.isoft91.common.base.controller.BaseController;



@RequestMapping("/article")
@Controller
public class StockArticleController extends BaseController {

	@Autowired
	private StockArticleService  service;
	
	
	
	
	@RequestMapping("/add.do")
	@ResponseBody
	public String addArticle(Article article)
	{		
		service.addArticle(article);
		return "OK";
	}

	@RequestMapping("/findalluser.do")
	@ResponseBody
	public Map<String,Object> findArticle(Integer page,Integer rows){
    	
    	if(page==null){
    		page=0;
    	}   	
    	if(rows==null||rows==0){
    		rows=100;
    	}
		 Map<String,Object>  res= service.findbypage((page-1)*rows,rows);
		return res;
		
	}
	@RequestMapping("/deletebyid.do")
	@ResponseBody
		public String deletebyid(Integer id)
	{
			
			service.deleteArticlebyid(id);
			return "OK";
			
	}
}
