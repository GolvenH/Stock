package com.isoft.stockplus.manager.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoft.stockplus.manager.dao.StockAdminDao;
import com.isoft.stockplus.manager.po.Admin;

@Service
public class StockAdminService
{
	@Autowired
	private StockAdminDao dao;

	
	public Map<String, Object> findbypage(Integer first, Integer max)
	{

		return dao.findByPage(first, max);
	}

	public void deleteUserbyid(Integer id)
	{
		dao.deleteById(id);
	}

	public Map<String, Object> getUserbyid(String id)
	{
		// TODO Auto-generated method stub
		Admin admin = dao.findById(Integer.valueOf(id));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Admin", admin);
		return map;
	}

	public List<Admin> loginUser(Admin admin)
	{
		return dao.login(admin);

	}

	public void updateUser(Admin admin)
	{

		dao.update(admin);

		System.out.println("se");

	}

	public List<Admin> login(Admin admin)
	{
		return dao.login(admin);

	}
	
}
