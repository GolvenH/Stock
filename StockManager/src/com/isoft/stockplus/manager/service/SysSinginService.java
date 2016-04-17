package com.isoft.stockplus.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isoft.stockplus.manager.dao.SysSinginDao;
import com.isoft.stockplus.manager.po.SysSignin;

/**
 * @ProjectName:MVCProject
 * @Description: 
 * @Copyright: Copyright (c) 2016
 * @Company:天津市融创软通科技有限公司
 * @author: 周楠
 * @date 2016年4月15日 下午6:46:12
 */
@Service
public class SysSinginService  {
	
	@Autowired
	private SysSinginDao dao;
	
	
	public SysSinginDao getDao() {
		return dao;
	}

	public void setDao(SysSinginDao dao) {
		this.dao = dao;
	}

	public void test(){
	
	System.out.println("service test");
		
	}
	
	
	public List selectList(){
		
		
		return dao.findAll();
	}
	
	
	public SysSignin addSysSignin(SysSignin entity){
		
		 dao.saveOrUpdate(entity);
		 return entity;
	}

}