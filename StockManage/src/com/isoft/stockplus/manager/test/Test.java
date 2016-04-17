package com.isoft.stockplus.manager.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.isoft.stockplus.manager.contorller.Controller1;
import com.isoft.stockplus.manager.service.Service;
import com.isoft.stockplus.manager.service.Service1;
import com.isoft.stockplus.manager.service.Service2;

/**
 * @ProjectName:MVCProject
 * @Description: 
 * @Copyright: Copyright (c) 2016
 * @Company:天津市融创软通科技有限公司
 * @author: 周楠
 * @date 2016年4月15日 下午6:45:47
 */

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		
		
		Service  service= new Service1();
		Controller1 controller=new Controller1();
		
		
		yilai(service,controller);
		
		
	}
	
	
	
	public static void fanshe(){
//		Scanner scan=new Scanner(System.in);
//		
//		 String   clazzname= scan.nextLine();
//		 
//		 Class clazz= Class.forName(clazzname);
//		
//		Object obj=clazz.newInstance();
//	
//		System.out.println(obj);
//		

	}
	
	
	public static void yilai(Service  service,Controller1 controller){
	
		
		controller.setS1(new Service1());   //组合式 依赖   也就注入是依赖
		
		
		
		
	}
	
}
