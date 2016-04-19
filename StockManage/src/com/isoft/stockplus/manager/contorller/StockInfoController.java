package com.isoft.stockplus.manager.contorller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoft.stockplus.manager.po.StockInfo;
import com.isoft.stockplus.manager.po.User;
import com.isoft.stockplus.manager.service.StockInfoService;
import com.isoft.stockplus.manager.service.StockUserService;
import com.isoft91.common.base.controller.BaseController;



@RequestMapping("/stock")
@Controller
public class StockInfoController extends BaseController {

	@Autowired
	private StockInfoService service;
	
	
	
	@RequestMapping("/findall")
	@ResponseBody
	public List<StockInfo> getall(){
		
		return service.getall();
		
	}
	
	@RequestMapping("/findbyid.do")
	@ResponseBody
	public Map<String,Object> getbyid(String id){
		
		Map<String,Object> map =service.getStockinfobyid(id);
		
		return map;
		
	}
}
