package com.isoft.stockplus.manager.contorller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.isoft.stockplus.manager.po.User;
import com.isoft.stockplus.manager.service.StockUserService;
import com.isoft91.common.base.controller.BaseController;


@RequestMapping("/user")
@Controller
public class StockUserController extends BaseController {

	private ModelAndView mav;
	
	@Autowired
	private StockUserService  service;
		@RequestMapping("/findalluser.do")
		@ResponseBody
		public Map<String,Object> finduser(Integer page,Integer rows){
	    	
	    	if(page==null){
	    		page=0;
	    	}   	
	    	if(rows==null||rows==0){
	    		rows=100;
	    	}
			 Map<String,Object>  res= service.findbypage((page-1)*rows,rows);
			return res;
			
		}
	@RequestMapping("/add.do")
	@ResponseBody
	public String addUser(User user)
	{
		String now = Long.toString(new Date().getTime());
		System.out.println(now);
		user.setRecordDate(now);
		Short s = 0;
		user.setUserAccount(s);
		
		service.addUser(user);
		return "OK";
	}
	
	@RequestMapping("/update.do")
	@ResponseBody
	public String updateUser(User user)
	{
		String now = Long.toString(new Date().getTime());
		user.setRecordDate(now);

		service.updateUser(user);
		return "OK";
	}

	@RequestMapping("/deletebyid.do")
	@ResponseBody
		public String deletebyid(Integer id){
			
			service.deleteUserbyid(id);
			return "OK";
		}
	@RequestMapping("/findbyid.do")
	@ResponseBody
	public Map<String,Object> getbyid(String id){
		
		System.out.println("=========="+id+"==========================");
		Map<String,Object> map =service.getUserbyid(id);
		return map;
	}
	

	@RequestMapping("/lo.do")
	public String login(User user){
		if(service.login(user).size()>0)
		{
			return   "redirect:/index.jsp";
		}
			else
		{
			return "redirect:/login.jsp";
		}

	}
	
}
