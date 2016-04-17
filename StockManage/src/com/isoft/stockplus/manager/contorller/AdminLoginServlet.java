package com.isoft.stockplus.manager.contorller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.isoft.stockplus.manager.service.Service2;

public class AdminLoginServlet extends HttpServlet {

	public AdminLoginServlet() {
		super();
	}

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 ApplicationContext apc
		 =WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		 Service2 ser2=apc.getBean(Service2.class);
			
		 ser2.test();
		 
//		 request.getWriter().println(ser2.toString());
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
