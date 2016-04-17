package com.isoft.stockplus.manager.contorller;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.isoft.stockplus.manager.service.Service;
import com.isoft.stockplus.manager.test.PoBean;
import com.isoft91.common.base.controller.BaseController;



@RequestMapping("/cont1")
@Controller
public class Controller1  extends BaseController{
	

	@Autowired
	private Service s1 ;
	
	public Service getS1() {
		return s1;
	}

	public void setS1(Service s1) {
		this.s1 = s1;
	}

	
	/**
	 * 请求转发 模式   可以是String   ModelAndView  
	 * @MethodName:test
	 * @author: 姓名
	 * @date 2016年4月16日 下午4:39:08
	 * @param key
	 * @return
	 */
	@RequestMapping("/test.do")
	public ModelAndView test(String key){
		
	 String  value=key+new Date().toString();
	  
	  Map<String, String> map=new HashMap<String, String>();
	  
	  map.put("nextkey", value);
	 
	  s1.test();
		
		return   new ModelAndView("/index.jsp",map) ;   //请求转发
		

	} 
	
	/**
	 * 重定向方式   之支持String 
	 * @MethodName:redirectindex
	 * @author: 姓名
	 * @date 2016年4月16日 下午4:38:59
	 * @return
	 */
	@RequestMapping("/redirectindex.do")
	public String redirectindex(){
		
	
		return  "redirect:/index.jsp";
		

	} 
	
	
	
	/**
	 *  ResponseBody 模式主要返回json 结果   支持几乎所有的类型
	 * @MethodName:testJson
	 * @author: 姓名
	 * @date 2016年4月16日 下午4:43:23
	 * @return
	 */
	@RequestMapping("/str.do")
	@ResponseBody
	public Object testJson(){
	
		
		PoBean po=PoBean.getnewInstance();
		
		
		po.setName("测试的名字");
		po.setDate(new Date());
		
		return po;

	}
	
}
