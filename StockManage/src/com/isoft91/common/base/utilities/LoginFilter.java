package com.isoft91.common.base.utilities;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.text.ChangedCharSetException;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {

	static final HashMap<String, HttpSession> ALL_SESSION = new HashMap<String, HttpSession>();
    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	   // TODO Auto-generated method stub
	   request.setCharacterEncoding("utf-8");
	   response.setCharacterEncoding("utf-8");
	   response.setContentType("text/html");
	   HttpServletRequest req = (HttpServletRequest) request;
	   HttpServletResponse resp = (HttpServletResponse) response;
	   resp.setContentType("text/html");
	   req.setCharacterEncoding("utf-8");
	   resp.setCharacterEncoding("utf-8");
	   
       if (req.getRequestURI().equals("/StockManage/login.jsp")){
           System.out.println("过滤登录信息");
           HttpSession session = req.getSession(true);
		   session.setAttribute("user", "denglu");
		   HttpSession exsistsSession = ALL_SESSION.put("user", session);
           chain.doFilter(req, resp);
       }else{
	        HttpSession session = req.getSession(true);
	        Object user = (session.getAttribute("user"));
	        if (user == null || user.equals("denglu"))
	        {
	            System.out.println("没有登录不能访问");
	            resp.sendRedirect("/StockManage/login.jsp");
	        }
	        else{
	        	System.out.println(user+"用户已经登录");
	        }
//	        chain.doFilter(req, resp);
		}
	   chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
