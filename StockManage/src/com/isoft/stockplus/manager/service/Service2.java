package com.isoft.stockplus.manager.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.isoft.stockplus.manager.dao.Dao1;



@org.springframework.stereotype.Service
public class Service2   implements  Service {
	@Autowired
	private Dao1 dao;
	public Dao1 getDao() {
		return dao;
	}
	public void setDao(Dao1 dao) {
		this.dao = dao;
	}


	public void test(){
		
		System.out.println(" server test ");
		
		System.out.println(new Date());
		
		dao.select();
		
	}

}
