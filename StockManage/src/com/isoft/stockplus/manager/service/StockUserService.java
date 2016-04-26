package com.isoft.stockplus.manager.service;

import java.util.HashMap;
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

	public void deleteUserbyid(Integer id)
	{
		dao.deleteById(id);		
	}

	public Map<String, Object> getUserbyid(String id)
	{
		// TODO Auto-generated method stub
		 User user= dao.findById(Integer.valueOf(id));
		 Map<String, Object> map=new HashMap<String, Object>();
		 map.put("User", user);
		 return map;	}
	

	public List<User> loginUser(User user){
			return dao.login(user);
		
	}

	
	public void updateUser(User user){
		
		dao.update(user);

		System.out.println("se");


	}

	public List<User> login(User user){
		return dao.login(user);
		   
	   }
}
