package com.isoft.stockplus.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isoft.stockplus.manager.dao.Dao1;

/**
 * @ProjectName:MVCProject
 * @Description: 
 * @Copyright: Copyright (c) 2016
 * @Company:天津市融创软通科技有限公司
 * @author: 周楠
 * @date 2016年4月15日 下午6:46:12
 */

public class Service1  implements  Service{
	
	@Autowired
	private Dao1 dao;
	
	
	public Dao1 getDao() {
		return dao;
	}

	public void setDao(Dao1 dao) {
		this.dao = dao;
	}

	public void test(){
		
		System.out.println("service test");
		
		dao.select();
		
	}

}
