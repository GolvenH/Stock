package com.isoft.stockplus.manager.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoft.stockplus.manager.dao.StockDataDao;
import com.isoft.stockplus.manager.dao.StockInfoDao;
import com.isoft.stockplus.manager.dao.StockUserDao;
import com.isoft.stockplus.manager.po.StockData;
import com.isoft.stockplus.manager.po.StockInfo;;

@Service
public class StockInfoService {
	@Autowired
	private StockInfoDao sidao;
	
	@Autowired
	private StockDataDao sddao;
	public List<StockInfo>  getall(){
		return sidao.findAll();
	}
	
	public Map<String,Object> getStockinfobyid(String id){
		StockInfo si=  	sidao.findById(Integer.valueOf(id));
		 List<StockData> sdlist=sddao.findbyStockinfoId(Integer.valueOf(id));
		 Map<String, Object> map=new HashMap<String, Object>();
		 map.put("Stock", si);
		 map.put("StockData", sdlist);
		 
		 
		 return map;
		
	}
}
