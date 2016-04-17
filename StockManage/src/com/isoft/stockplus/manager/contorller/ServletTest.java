package com.isoft.stockplus.manager.contorller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.isoft.stockplus.manager.service.Service2;


/**
 * @ProjectName:MVCProject
 * @Description: 
 * @Copyright: Copyright (c) 2016
 * @Company:天津市融创软通科技有限公司
 * @author: 周楠
 * @date 2016年4月16日 下午2:39:45
 */

public class ServletTest extends HttpServlet{
	
	
	
	
	
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	this.doPost(req, resp);
	}
	
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		 
		 
		 ApplicationContext apc
		 =WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
		 Service2 ser2=apc.getBean(Service2.class);
		
		 ser2.test();
		 
		 resp.getWriter().println(ser2.toString());
		 
		 
	}
}
