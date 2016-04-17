package com.isoft.stockplus.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoft.stockplus.manager.dao.OsrStaffDao;
import com.isoft.stockplus.manager.po.OsrStaff;

/**
 * @ProjectName:MVCProject
 * @Description: 
 * @Copyright: Copyright (c) 2016
 * @Company:天津市融创软通科技有限公司
 * @author: 周楠
 * @date 2016年4月17日 下午3:08:05
 */
@Service
public class OsrStaffService {
	
	@Autowired
	private OsrStaffDao  dao;

	
	public void addStaff(OsrStaff staff){
		
		dao.saveOrUpdate(staff);
	}
	
	
	public List<OsrStaff> findall(){
		
		return dao.findAll();
		
	}
	
	
}
