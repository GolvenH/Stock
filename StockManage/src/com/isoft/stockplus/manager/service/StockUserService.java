package com.isoft.stockplus.manager.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoft.stockplus.manager.dao.StockUserDao;
import com.isoft.stockplus.manager.po.User;

@Service
public class StockUserService {
	@Autowired
	private StockUserDao  dao;

	
	public void addUser(User user){
		
		dao.saveOrUpdate(user);

		System.out.println("se");


	}
	
	
    public Map<String,Object> findbypage(Integer first,Integer max){
		
		return dao.findByPage(first, max);
		
	}
	public List<User> findall(){
		
		return dao.findAll();
		
		
	}
	
	public List<User> findById(){
		return null;
		
//		return dao.findById(Int id);
	}


	public void deleteUserbyid(Integer id)
	{
		dao.deleteById(id);		
	}
}
