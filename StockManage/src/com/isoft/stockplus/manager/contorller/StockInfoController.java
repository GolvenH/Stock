package com.isoft.stockplus.manager.contorller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoft.stockplus.manager.service.StockInfoService;
import com.isoft91.common.base.controller.BaseController;



@RequestMapping("/stock")
@Controller
public class StockInfoController extends BaseController {

	@Autowired
	private StockInfoService service;

    @RequestMapping("/findallstock.do")
	@ResponseBody
	public Map<String,Object> findstaff(Integer page,Integer rows){
    	
    	if(page==null){
    		page=0;
    	}
    	if(rows==null||rows==0){
    		rows=100;
    	}		
		 Map<String,Object>  res= service.findbypage((page-1)*rows,rows);
	
		return res;
		
	}
	@RequestMapping("/findbyid.do")
	@ResponseBody
	public Map<String,Object> getbyid(String id){
		
		Map<String,Object> map =service.getStockinfobyid(id);
		return map;
	}
	@RequestMapping("/deletebyid.do")
	@ResponseBody
		public String deletebyid(Integer id){
			
			service.deleteStockinfobyid(id);
			return "OK";
			
		}
}
