package com.isoft.stockplus.manager.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.isoft.stockplus.manager.contorller.Controller1;
import com.isoft.stockplus.manager.service.Service1;

/**
 * @ProjectName:MVCProject
 * @Description: 
 * @Copyright: Copyright (c) 2016
 * @Company:天津市融创软通科技有限公司
 * @author: 周楠
 * @date 2016年4月16日 上午10:05:43
 */

public class Spring {
   public static void main(String[] args) {
	
	   ApplicationContext   apc=new ClassPathXmlApplicationContext("applicationContext.xml");
	   
	   Controller1  controller =apc.getBean(Controller1.class);
	  
	  
	   
	   //FileSystempath 操作系统绝对路径
	   
	   //ClassPath  类所在相对路径
	   
	   //projectpath 项目所在相对路径
	   
	   
}
}
