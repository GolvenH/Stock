package com.isoft.stockplus.manager.contorller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isoft.stockplus.manager.po.Admin;
import com.isoft.stockplus.manager.service.StockAdminService;
import com.isoft91.common.base.controller.BaseController;


@RequestMapping("/admin")
@Controller
public class StockAdminController extends BaseController {

	
	@Autowired
	private StockAdminService  service;

	@RequestMapping("/update.do")
	@ResponseBody
	public String updateUser(Admin admin)
	{


		service.updateUser(admin);
		return "OK";
	}


	@RequestMapping("/findbyid.do")
	@ResponseBody
	public Map<String,Object> getbyid(String id){
		
		Map<String,Object> map =service.getUserbyid(id);
		return map;
	}
	

	@RequestMapping("/lo.do")
	public String login(Admin admin,HttpSession session){
		if(service.login(admin).size()>0)
		{
			session.setAttribute("adminId",1);
			return   "redirect:/index.jsp";
		}
			else
		{
			return "redirect:/login.jsp";
		}
	}

}
