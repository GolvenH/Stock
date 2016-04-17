package com.isoft.stockplus.manager.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoft.stockplus.manager.po.OsrStaff;
import com.isoft.stockplus.manager.service.OsrStaffService;

/**
 * @ProjectName:MVCProject
 * @Description: 
 * @Copyright: Copyright (c) 2016
 * @Company:天津市融创软通科技有限公司
 * @author: 周楠
 * @date 2016年4月17日 下午3:11:03
 */

@RequestMapping("/staff")
@Controller
public class OsrStaffController {
    @Autowired
	private OsrStaffService  service;
	
	
	@RequestMapping("/all.do")
	@ResponseBody
	public List<OsrStaff>  getAllstaff(){
		
		return service.findall();
		
	}
	
	@RequestMapping("/add.do")
	@ResponseBody
	public String addstaff(OsrStaff staff){
		
		service.addStaff(staff);
		
		return "OK";
		
	}
	
	
	
	
}
